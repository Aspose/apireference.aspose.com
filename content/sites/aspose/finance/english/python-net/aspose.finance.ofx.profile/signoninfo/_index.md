---
title: SignonInfo class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 390
url: /python-net/aspose.finance.ofx.profile/signoninfo/
is_root: false
---

## SignonInfo class

Signon information class.



The SignonInfo type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [SignonInfo()](/finance/python-net/aspose.finance.ofx.profile/signoninfo/__init__/#) | Initializes a new instance of [SignonInfo](/finance/python-net/aspose.finance.ofx.profile/signoninfo) class. |


### Properties
| Property | Description |
| :- | :- |
| [signon_realm](/finance/python-net/aspose.finance.ofx.profile/signoninfo/signon_realm) | Gets or sets the identifies this realm. |
| [min](/finance/python-net/aspose.finance.ofx.profile/signoninfo/min) | Gets or sets the minimum number of password characters. |
| [max](/finance/python-net/aspose.finance.ofx.profile/signoninfo/max) | Gets or sets the maximum number of password characters |
| [char_type](/finance/python-net/aspose.finance.ofx.profile/signoninfo/char_type) | Gets or sets the type of characters allowed in password. |
| [case_sensitive](/finance/python-net/aspose.finance.ofx.profile/signoninfo/case_sensitive) | Gets or sets whether password is case-sensitive. |
| [special](/finance/python-net/aspose.finance.ofx.profile/signoninfo/special) | Gets or sets whether special characters are allowed over and above those characters. |
| [spaces](/finance/python-net/aspose.finance.ofx.profile/signoninfo/spaces) | Gets or sets whether spaces are allowed over and above those characters. |
| [pinch](/finance/python-net/aspose.finance.ofx.profile/signoninfo/pinch) | Gets or sets whether server supports PIN change requests. |
| [change_pin_first](/finance/python-net/aspose.finance.ofx.profile/signoninfo/change_pin_first) | Gets or sets whether server requires clients to change user password as part of first signon. |
| [user_credential_1_label](/finance/python-net/aspose.finance.ofx.profile/signoninfo/user_credential_1_label) | Gets or sets the text prompt for user credential. If it is present, a third credential (USERCRED1) is required in addition to USERID and USERPASS. |
| [user_credential_2_label](/finance/python-net/aspose.finance.ofx.profile/signoninfo/user_credential_2_label) | Gets or sets the text prompt for user credential. If it is present, a fourth credential (USERCRED2) is required in addition to USERID, USERPASS and USERCRED1. If present, UserCredential1Label must also be present. |
| [clientuid_require](/finance/python-net/aspose.finance.ofx.profile/signoninfo/clientuid_require) | Gets or sets whether CLIENTUID is required. |
| [auth_token_first](/finance/python-net/aspose.finance.ofx.profile/signoninfo/auth_token_first) | Gets or sets whether server requires clients to send AUTHTOKEN as part of the first signon. |
| [auth_token_label](/finance/python-net/aspose.finance.ofx.profile/signoninfo/auth_token_label) | Gets or sets the text label for the AUTHTOKEN. |
| [auth_token_info_url](/finance/python-net/aspose.finance.ofx.profile/signoninfo/auth_token_info_url) | Gets or sets the URL where AUTHTOKEN information is provided by the institution operating the OFX server. |
| [mfa_challenge_support](/finance/python-net/aspose.finance.ofx.profile/signoninfo/mfa_challenge_support) | Gets or sets whether the server supports MFACHALLENGE functionality. |
| [mfa_challenge_first](/finance/python-net/aspose.finance.ofx.profile/signoninfo/mfa_challenge_first) | Gets or sets whether the client is required to send MFACHALLENGERQ as part of the first signon, before sending any other requests. |
| [access_token_require](/finance/python-net/aspose.finance.ofx.profile/signoninfo/access_token_require) | Gets or sets whether the server requires ACCESSTOKEN for all requests except profile. |


### See Also

* module [aspose.finance.ofx.profile](../)
