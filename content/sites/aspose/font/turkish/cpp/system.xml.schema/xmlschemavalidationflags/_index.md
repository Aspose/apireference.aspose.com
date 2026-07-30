---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. C++'ta XmlSchemaValidator ve XmlReader sınıfları tarafından kullanılan şema doğrulama seçeneklerini belirtir."
type: docs
weight: 7900
url: /tr/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Şema doğrulama seçeneklerini, [XmlSchemaValidator](../xmlschemavalidator/) ve [XmlReader](../../system.xml/xmlreader/) sınıfları tarafından kullanılan şekilde belirtir.

```cpp
enum class XmlSchemaValidationFlags
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Yok | 0 | Kimlik kısıtlamalarını, satır içi şemaları, şema konum ipuçlarını işleme ve şema doğrulama uyarılarını raporlamayın. |
| ProcessInlineSchema | 1 | Doğrulama sırasında karşılaşılan satır içi şemaları işle. |
| ProcessSchemaLocation | 2 | Doğrulama sırasında karşılaşılan şema konum ipuçlarını (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) işle. |
| ReportValidationWarnings | 4 | Doğrulama sırasında karşılaşılan şema doğrulama uyarılarını raporla. |
| ProcessIdentityConstraints | 8 | Doğrulama sırasında karşılaşılan kimlik kısıtlamalarını (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) işle. |
| AllowXmlAttributes | 16 | Şemada tanımlı olmasa bile xml:* özniteliklerine izin ver. Öznitelikler veri tiplerine göre doğrulanacaktır. |

## Ayrıca Bakınız

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
