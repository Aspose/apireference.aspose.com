---
title: StatementTransaction class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 940
url: /python-net/aspose.finance.ofx/statementtransaction/
is_root: false
---

## StatementTransaction class

This class describes a single transaction. It identifies the type of the transaction and the date it was posted.The class can also provide additional information to help the customer recognize the transaction: check number, payee name, and memo. The transaction can have a Standard Industrial Code that a client can use to categorize the transaction.



The StatementTransaction type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [StatementTransaction()](/finance/python-net/aspose.finance.ofx/statementtransaction/__init__/#) | Initializes a new instance of [StatementTransaction](/finance/python-net/aspose.finance.ofx/statementtransaction) class. |


### Properties
| Property | Description |
| :- | :- |
| [transaction_type](/finance/python-net/aspose.finance.ofx/statementtransaction/transaction_type) | Gets or sets the transaction type. |
| [posted_date](/finance/python-net/aspose.finance.ofx/statementtransaction/posted_date) | Gets or sets the date transaction was posted to account. |
| [user_date](/finance/python-net/aspose.finance.ofx/statementtransaction/user_date) | Gets or sets the date user initiated transaction, if known. |
| [available_date](/finance/python-net/aspose.finance.ofx/statementtransaction/available_date) | Gets or sets the date funds are available (value date). |
| [transaction_amount](/finance/python-net/aspose.finance.ofx/statementtransaction/transaction_amount) | Gets or sets the amount of transaction. |
| [financial_institution_transaction_id](/finance/python-net/aspose.finance.ofx/statementtransaction/financial_institution_transaction_id) | Gets or sets the transaction ID issued by financial institution. |
| [correct_financial_institution_transaction_id](/finance/python-net/aspose.finance.ofx/statementtransaction/correct_financial_institution_transaction_id) | Gets or sets the corrected transaction ID. If present, the FinancialInstitutionTransactionId of a previously sent transaction that is corrected by this record. |
| [corrective_action](/finance/python-net/aspose.finance.ofx/statementtransaction/corrective_action) | Gets or sets the corrective action. |
| [server_transaction_id](/finance/python-net/aspose.finance.ofx/statementtransaction/server_transaction_id) | Gets or sets the server assigned transaction ID. |
| [check_number](/finance/python-net/aspose.finance.ofx/statementtransaction/check_number) | Gets or sets the check number. |
| [reference_number](/finance/python-net/aspose.finance.ofx/statementtransaction/reference_number) | Gets or sets the reference number that uniquely identifies the transaction. |
| [standard_industrial_code](/finance/python-net/aspose.finance.ofx/statementtransaction/standard_industrial_code) | Gets or sets the Standard Industrial Code. |
| [payee_id](/finance/python-net/aspose.finance.ofx/statementtransaction/payee_id) | Gets or sets the payee identifier if available. |
| [name](/finance/python-net/aspose.finance.ofx/statementtransaction/name) | Gets or sets the name of payee or description of transaction. |
| [payee](/finance/python-net/aspose.finance.ofx/statementtransaction/payee) | Gets or sets the [StatementTransaction.payee](/finance/python-net/aspose.finance.ofx/statementtransaction#payee). |
| [extended_name](/finance/python-net/aspose.finance.ofx/statementtransaction/extended_name) | Gets or sets the extended name of payee or description of transaction. |
| [account_to](/finance/python-net/aspose.finance.ofx/statementtransaction/account_to) | Gets or sets the to account, [BankAccount](/finance/python-net/aspose.finance.ofx/bankaccount) or [CreditCardAccount](/finance/python-net/aspose.finance.ofx/creditcardaccount). |
| [memo](/finance/python-net/aspose.finance.ofx/statementtransaction/memo) | Gets or sets the extra information. |
| [currency](/finance/python-net/aspose.finance.ofx/statementtransaction/currency) | Gets or sets the [StatementTransaction.currency](/finance/python-net/aspose.finance.ofx/statementtransaction#currency). |
| [origin_currency](/finance/python-net/aspose.finance.ofx/statementtransaction/origin_currency) | Gets or sets the Origin [StatementTransaction.currency](/finance/python-net/aspose.finance.ofx/statementtransaction#currency). |
| [investment_401k_source](/finance/python-net/aspose.finance.ofx/statementtransaction/investment_401k_source) | Gets or sets the source of cash for this transaction. |
| [image_datas](/finance/python-net/aspose.finance.ofx/statementtransaction/image_datas) | Gets or sets the collection of [ImageData](/finance/python-net/aspose.finance.ofx/imagedata). |


### See Also

* module [aspose.finance.ofx](../)
