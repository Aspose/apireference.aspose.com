---
title: Enum FileAsMapping
second_title: Aspose.Email for .NET API Reference
description: Aspose.Email.PersonalInfo.FileAsMapping enum. Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MSOXPROPS revision 16.2 from 7/31/2014
type: docs
weight: 19660
url: /net/aspose.email.personalinfo/fileasmapping/
---
## FileAsMapping enumeration

Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014

```csharp
public enum FileAsMapping : long
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Empty | `0` | Empty value. |
| DisplayName | `12289` | DisplayName |
| FirstName | `14854` | GivenName |
| LastName | `14865` | Surname |
| Organization | `14870` | CompanyName |
| FirstMiddleLastGen | `32823` | GivenName MiddleName Surname Generation |
| LastFirstMiddle | `32791` | Surname, GivenName MiddleName |
| LastFirstMiddle2 | `32816` | SurnameGivenName MiddleName |
| LastFirstMiddle3 | `32817` | Surname GivenName MiddleName |
| OrgLastFirstMiddle | `32792` | CompanyName\r\nSurname, GivenName MiddleName |
| OrgLastFirstMiddle2 | `32818` | CompanyName\r\nSurnameGivenName MiddleName |
| OrgLastFirstMiddle3 | `32819` | CompanyName\r\nSurname GivenName MiddleName |
| LastFirstMiddleOrg | `32793` | Surname, GivenName MiddleName\r\nCompanyName |
| LastFirstMiddleOrg2 | `32820` | SurnameGivenName MiddleName\r\nCompanyName |
| LastFirstMiddleOrg3 | `32821` | Surname GivenName PidTagMiddleName\r\nCompanyName |
| LastFirstMiddleGen | `32822` | Surname GivenName MiddleName Generation |
| LastFirstMiddleGen2 | `32824` | SurnameGivenName MiddleName Generation |
| BestMatch | `4294967293` | Specifies that, when displaying the contact, the application should attempt to use the current value of dispidFileUnder and other contact properties to find a "best match" for dispidFileUnderId to one of the previous values in this table. |
| AccordingToLocale | `4294967294` | Specifies that, when displaying the contact, the application should choose the appropriate default values (according to the language locale) for dispidFileUnderId and update dispidFileUnder to match the choice. |
| None | `4294967295` | Specifies that, FileUnder is a user-provided, and should not be changed when another contact name property changes. I.e. value of FileUnder is not constructed from other properties. |

### See Also

* namespace [Aspose.Email.PersonalInfo](../../aspose.email.personalinfo/)
* assembly [Aspose.Email](../../)


