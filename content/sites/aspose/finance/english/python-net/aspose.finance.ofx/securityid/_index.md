---
title: SecurityId class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 870
url: /python-net/aspose.finance.ofx/securityid/
is_root: false
---

## SecurityId class

Securities must be consistently identified to allow client applications to prepare accurate investment
reports across all user investment accounts, even at multiple FIs.At this time, neither a security name nor
its symbol is standardized.Therefore, OFX uses CUSIP numbers (a unique 9-digit alphanumeric
identifier) to identify securities. CUSIP numbers are available for the vast majority of securities traded
today, including those without symbols such as bonds. For a security that does not have a CUSIP, a
financial institution must follow the standard procedure of assigning a CUSIP by using itself as the issuer
to avoid conflict with any other CUSIP.



The SecurityId type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [SecurityId()](/finance/python-net/aspose.finance.ofx/securityid/__init__/#) | Initializes a new instance of [SecurityId](/finance/python-net/aspose.finance.ofx/securityid) class. |


### Properties
| Property | Description |
| :- | :- |
| [unique_id](/finance/python-net/aspose.finance.ofx/securityid/unique_id) | Gets or sets the Unique identifier for the security. CUSIP for US FIs. |
| [unique_id_type](/finance/python-net/aspose.finance.ofx/securityid/unique_id_type) | Gets or sets the name of standard used to identify the security i.e., “CUSIP” for FIs in the United States. |


### See Also

* module [aspose.finance.ofx](../)
