---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes विधि"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes विधि। डिफ़ॉल्ट एट्रिब्यूट्स पर पहचान बाधाओं को सत्यापित करता है और List को उन XmlSchemaAttribute ऑब्जेक्ट्स से भरता है जिनके डिफ़ॉल्ट मान हैं और जिन्हें पहले XmlSchemaValidator::ValidateAttribute विधि का उपयोग करके तत्व संदर्भ में C++ में सत्यापित नहीं किया गया है।"
type: docs
weight: 900
url: /hi/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


डिफ़ॉल्ट एट्रिब्यूट्स पर पहचान बाधाओं को सत्यापित करता है और निर्दिष्ट List को उन [XmlSchemaAttribute](../../xmlschemaattribute/) ऑब्जेक्ट्स से भरता है जिनके डिफ़ॉल्ट मान हैं और जिन्हें पहले [XmlSchemaValidator::ValidateAttribute](../validateattribute/) विधि का उपयोग करके तत्व संदर्भ में सत्यापित नहीं किया गया है।

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | एक List जिसे तत्व संदर्भ में सत्यापन के दौरान अभी तक न मिलने वाले एट्रिब्यूट्स के लिए [XmlSchemaAttribute](../../xmlschemaattribute/) ऑब्जेक्ट्स से भरना है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
