---
title: "Método System::Xml::XmlUrlResolver::GetEntity"
linktitle: "GetEntity"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlUrlResolver::GetEntity. Asocia un URI a un objeto que contiene el recurso real en C++."
type: docs
weight: 200
url: /es/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Asocia un URI a un objeto que contiene el recurso real.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | El URI devuelto por la llamada a [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| rol | String | Actualmente no se usa. |
| ofObjectToReturn | const TypeInfo\& | El tipo de objeto a devolver. La implementación actual solo devuelve objetos Stream. |

### ReturnValue

Un objeto de flujo o **nullptr** si se especifica un tipo que no sea flujo.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
