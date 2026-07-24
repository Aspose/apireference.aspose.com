---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes metod"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes metod. Validerar identitetsrestriktioner på standardattributen och fyller den angivna List‑en med XmlSchemaAttribute‑objekt för alla attribut med standardvärden som ännu inte har validerats med XmlSchemaValidator::ValidateAttribute‑metoden i elementkontexten i C++."
type: docs
weight: 900
url: /sv/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


Validerar identitetsrestriktioner på standardattributen och fyller den angivna List‑en med [XmlSchemaAttribute](../../xmlschemaattribute/)‑objekt för alla attribut med standardvärden som ännu inte har validerats med [XmlSchemaValidator::ValidateAttribute](../validateattribute/)‑metoden i elementkontexten.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | En List att fylla med [XmlSchemaAttribute](../../xmlschemaattribute/)‑objekt för alla attribut som ännu inte påträffats under validering i elementkontexten. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
