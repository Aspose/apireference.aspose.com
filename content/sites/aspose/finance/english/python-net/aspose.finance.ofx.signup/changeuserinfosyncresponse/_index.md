---
title: ChangeUserInfoSyncResponse class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/
is_root: false
---

## ChangeUserInfoSyncResponse class

Change user information synchronization response class.



**Inheritance:** [ChangeUserInfoSyncResponse](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse) → 
[AbstractSyncResponse](/finance/python-net/aspose.finance.ofx/abstractsyncresponse) → 
[AbstractResponse](/finance/python-net/aspose.finance.ofx/abstractresponse)



The ChangeUserInfoSyncResponse type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [ChangeUserInfoSyncResponse()](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/__init__/#) | Initializes a new instance of [ChangeUserInfoSyncResponse](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse) class. |


### Properties
| Property | Description |
| :- | :- |
| [token](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/token) | Gets or sets the new synchronization token. |
| [lost_synchronization](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/lost_synchronization) | Yes if the token in the synchronization request is older than the earliest entry in the server’s history table.In this case, some responses have been lost.<br/>No if the token in the synchronization request is newer than or matches a token in the server’s history table. |
| [ofx_extension](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/ofx_extension) | Gets or sets the [OfxExtensionType](/finance/python-net/aspose.finance.ofx/ofxextensiontype). |
| [change_user_info_transaction_responses](/finance/python-net/aspose.finance.ofx.signup/changeuserinfosyncresponse/change_user_info_transaction_responses) | Gets or sets the collection of [ChangeUserInfoTransactionResponse](/finance/python-net/aspose.finance.ofx.signup/changeuserinfotransactionresponse). |


### See Also

* module [aspose.finance.ofx.signup](../)
* class [AbstractSyncResponse](/finance/python-net/aspose.finance.ofx.signup/abstractsyncresponse)
