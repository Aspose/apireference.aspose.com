---
title: Class StatementTransaction
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.StatementTransaction कक्ष. यह वर्ग एकल लेनदेन क वर्णन करत है यह लेनदेन के प्रकर और पस्ट कए जने क तरख क पहचन करत है ग्रहक क लेनदेन क पहचनने में मदद करने के लए वर्ग अतरक्त जनकर भ प्रदन कर सकत है चेक नंबर प्रप्तकर्त क नम और मेम लेनदेन में एक मनक औद्यगक कड ह सकत है जसक उपयग ग्रहक लेनदेन क वर्गकृत करने के लए कर सकत है
type: docs
weight: 5730
url: /hi/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

यह वर्ग एकल लेन-देन का वर्णन करता है। यह लेन-देन के प्रकार और पोस्ट किए जाने की तारीख की पहचान करता है। ग्राहक को लेन-देन को पहचानने में मदद करने के लिए वर्ग अतिरिक्त जानकारी भी प्रदान कर सकता है: चेक नंबर, प्राप्तकर्ता का नाम और मेमो। लेन-देन में एक मानक औद्योगिक कोड हो सकता है जिसका उपयोग ग्राहक लेन-देन को वर्गीकृत करने के लिए कर सकता है।

```csharp
public class StatementTransaction
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [StatementTransaction](statementtransaction/)() | का एक नया उदाहरण शुरू करता है`StatementTransaction` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto/) { get; set; } | खाता प्राप्त करता है या सेट करता है,[`BankAccount`](../bankaccount/) या[`CreditCardAccount`](../creditcardaccount/) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate/) { get; set; } | निधि उपलब्ध होने की तिथि प्राप्त करता है या सेट करता है (मूल्य दिनांक). |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber/) { get; set; } | चेक नंबर प्राप्त या सेट करता है। |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid/) { get; set; } | संशोधित लेन-देन आईडी प्राप्त या सेट करता है। यदि मौजूद है, तो पहले भेजे गए लेन-देन का FinancialInstitionTransactionId जो इस रिकॉर्ड द्वारा ठीक किया गया है। |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction/) { get; set; } | सुधारात्मक कार्रवाई करता है या सेट करता है। |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency/) { get; set; } | हो जाता है या सेट करता है[`Currency`](./currency/) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname/) { get; set; } | प्राप्तकर्ता का विस्तारित नाम या लेन-देन का विवरण प्राप्त या सेट करता है। |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid/) { get; set; } | वित्तीय संस्थान द्वारा जारी लेन-देन आईडी प्राप्त या सेट करता है। |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`ImageData`](../imagedata/) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource/) { get; set; } | इस लेन-देन के लिए नकदी का स्रोत प्राप्त या सेट करता है। |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo/) { get; set; } | अतिरिक्त जानकारी प्राप्त या सेट करता है। |
| [Name](../../aspose.finance.ofx/statementtransaction/name/) { get; set; } | प्राप्तकर्ता का नाम या लेन-देन का विवरण प्राप्त या सेट करता है। |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency/) { get; set; } | मूल को प्राप्त या सेट करता है[`Currency`](./currency/) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee/) { get; set; } | हो जाता है या सेट करता है[`Payee`](./payee/) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid/) { get; set; } | उपलब्ध होने पर प्राप्तकर्ता पहचानकर्ता प्राप्त या सेट करता है. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate/) { get; set; } | उस तारीख को प्राप्त या सेट करता है जब लेन-देन खाते में पोस्ट किया गया था। |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber/) { get; set; } | उस संदर्भ संख्या को प्राप्त या सेट करता है जो विशिष्ट रूप से लेन-देन की पहचान करता है। |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid/) { get; set; } | सर्वर द्वारा निर्दिष्ट लेन-देन आईडी प्राप्त या सेट करता है। |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode/) { get; set; } | मानक औद्योगिक कोड प्राप्त या सेट करता है। |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount/) { get; set; } | लेन-देन की राशि प्राप्त या सेट करता है। |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype/) { get; set; } | लेन-देन प्रकार प्राप्त या सेट करता है। |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate/) { get; set; } | उपयोगकर्ता द्वारा आरंभ किए गए लेन-देन की तिथि प्राप्त या सेट करता है, यदि ज्ञात हो। |

### यह सभी देखें

* नाम स्थान [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* सभा [Aspose.Finance](../../)


