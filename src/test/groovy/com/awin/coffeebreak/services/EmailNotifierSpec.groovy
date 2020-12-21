package com.awin.coffeebreak.services

import com.awin.coffeebreak.entity.CoffeeBreakPreference
import com.awin.coffeebreak.entity.StaffMember
import spock.lang.Specification

import static org.assertj.core.api.Assertions.assertThat

class EmailNotifierSpec extends Specification {

    def "testStatusOfNotificationIsTrue"() {
        given:
        def staff = new StaffMember()
        staff.setEmail("abc@awin.co.uk")
        def preference = new CoffeeBreakPreference("drink", "coffee", staff, null)

        def notificationService = new EmailNotifier()

        when:
        def status = notificationService.notifyStaffMemberThroughEmail(staff, [preference])

        then:
        assertThat(status).isTrue()
    }

    def "testThrowsExceptionWhenCannotNotify"() {
        given:
        def staff = new StaffMember()
        def preference = new CoffeeBreakPreference("drink", "tea", staff, null)
        def notificationService = new EmailNotifierService()

        when:
        def status = notificationService.emailStaffMemberThroughEmail(staff, [preference])

        then:
        thrown(RuntimeException.class)
    }
}
