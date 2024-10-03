---
title: System::Xml::XmlValidatingReader::LookupNamespace method
linktitle: LookupNamespace
second_title: Aspose.Page for C++
description: 'System::Xml::XmlValidatingReader::LookupNamespace method. Resolves a namespace prefix in the current element''s scope in C++.'
type: docs
weight: 4300
url: /cpp/system.xml/xmlvalidatingreader/lookupnamespace/
---
## XmlValidatingReader::LookupNamespace method


Resolves a namespace prefix in the current element's scope.

```cpp
String System::Xml::XmlValidatingReader::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| prefix | const String\& | The prefix whose namespace Uniform Resource Identifier (URI) you want to resolve. To match the default namespace, pass an empty string. |

### ReturnValue

The namespace URI to which the prefix maps or **nullptr** if no matching prefix is found.

## See Also

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
