---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive मेथड"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive मेथड. C++ में XmlSchemaSet से निर्दिष्ट XML Schema डिफिनिशन लैंग्वेज (XSD) स्कीमा और सभी आयातित स्कीमा को हटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


निर्दिष्ट XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा और सभी आयातित स्कीमा को [XmlSchemaSet](../) से हटाता है।

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) ऑब्जेक्ट जिसे [XmlSchemaSet](../) से हटाना है। |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
