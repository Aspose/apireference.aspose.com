---
title: "Метод System::Xml::XmlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlResolver::GetEntity. При переопределении в производном классе отображает URI в объект, содержащий реальный ресурс в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


При переопределении в производном классе отображает URI на объект, содержащий фактический ресурс.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI, возвращаемый вызовом [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| роль | String | В настоящее время не используется. |
| ofObjectToReturn | const TypeInfo\& | Тип возвращаемого объекта. Текущая версия возвращает только объекты Stream. |

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
* Library [Aspose.Font for C++](../../../)
