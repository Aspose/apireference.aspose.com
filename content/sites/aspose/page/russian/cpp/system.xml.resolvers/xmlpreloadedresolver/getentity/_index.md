---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity метод"
linktitle: "GetEntity"
second_title: "Aspose.Page для C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity метод. Отображает URI на объект, содержащий реальный ресурс в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Отображает URI на объект, содержащий фактический ресурс.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI, возвращаемый вызовом [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| role | String | В настоящее время не используется. |
| ofObjectToReturn | const TypeInfo\& | Тип возвращаемого объекта. [XmlPreloadedResolver](../) поддерживает объекты Stream и TextReader для URI, которые были добавлены как [String](../../../system/string/). Если запрошенный тип не поддерживается разрешителем, будет выброшено исключение. Используйте метод XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) для определения, поддерживается ли определённый **Type** этим разрешителем. |

### ReturnValue

Объект Stream или TextReader, соответствующий фактическому источнику.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
