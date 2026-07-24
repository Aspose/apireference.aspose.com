---
title: "System::Xml::XmlResolver::GetEntity метод"
linktitle: "GetEntity"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlResolver::GetEntity метод. При переопределении в производном классе сопоставляет URI с объектом, содержащим фактический ресурс, в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Когда переопределяется в производном классе, сопоставляет URI с объектом, содержащим фактический ресурс.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI, возвращаемый вызовом [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| role | String | В настоящее время не используется. |
| ofObjectToReturn | const TypeInfo\& | Тип объекта, который следует вернуть. Текущая версия возвращает только объекты Stream. |

### ReturnValue

Объект потока или **nullptr**, если указан тип, отличный от потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
