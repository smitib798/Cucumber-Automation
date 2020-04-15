$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsFF.feature");
formatter.feature({
  "line": 2,
  "name": "Create account of Facebook7",
  "description": "As a user you need to open facebook home page and do the validations",
  "id": "create-account-of-facebook7",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Validate create user multiple fields71",
  "description": "",
  "id": "create-account-of-facebook7;validate-create-user-multiple-fields71",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Database"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters user \"\u003cuser\u003e\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters user \"\u003csurname\u003e\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User checks user \"\u003cuser\u003e\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Mobile field should be blank",
  "keyword": "But "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;",
  "rows": [
    {
      "cells": [
        "user",
        "surname"
      ],
      "line": 14,
      "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;;1"
    },
    {
      "cells": [
        "Tom",
        "Jerry"
      ],
      "line": 15,
      "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;;2"
    },
    {
      "cells": [
        "Loren",
        "Hardik"
      ],
      "line": 16,
      "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Validate create user multiple fields71",
  "description": "",
  "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    },
    {
      "line": 5,
      "name": "@Database"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters user \"Tom\" first name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters user \"Jerry\" surname",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User checks user \"Tom\" first name is present inside textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Mobile field should be blank",
  "keyword": "But "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 22139262800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1390376300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jerry",
      "offset": 18
    }
  ],
  "location": "TagsSD.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 1206166700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tom",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1041146200,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.user_Mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 1035848500,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1100372400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate create user multiple fields71",
  "description": "",
  "id": "create-account-of-facebook7;validate-create-user-multiple-fields71;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    },
    {
      "line": 5,
      "name": "@Database"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters user \"Loren\" first name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters user \"Hardik\" surname",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User checks user \"Loren\" first name is present inside textbox",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Mobile field should be blank",
  "keyword": "But "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 22522343500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Loren",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1464480800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hardik",
      "offset": 18
    }
  ],
  "location": "TagsSD.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 1235009400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Loren",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1073825400,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.user_Mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 1033578100,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1044454200,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validate First Name field72",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field72",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 23209339000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1425533000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1025066500,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1061336900,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate First Name field73",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field73",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Smoke"
    },
    {
      "line": 25,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 22149527000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1451654300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1031051600,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1095330300,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Validate First Name field74",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field74",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 18419095700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1468839900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1031059400,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1053945800,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Validate First Name field75",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field75",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 22092649200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1463417700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1043526500,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1046721800,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Validate First Name field76",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field76",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 17883447200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1603309000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1029193800,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1074841000,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Validate First Name field77",
  "description": "",
  "id": "create-account-of-facebook7;validate-first-name-field77",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User checks user \"David\" first name is present inside textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.User_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 17193921500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1419075300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsSD.User_checks_user_first_name_is_present_inside_textbox(String)"
});
formatter.result({
  "duration": 1064483600,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.close_browser()"
});
formatter.result({
  "duration": 1050301200,
  "status": "passed"
});
});