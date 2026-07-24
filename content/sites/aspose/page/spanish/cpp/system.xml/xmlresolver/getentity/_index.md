---
title: "System::Xml::XmlResolver::GetEntity método"
linktitle: "GetEntity"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlResolver::GetEntity método. Cuando se sobrescribe en una clase derivada, asigna una URI a un objeto que contiene el recurso real en C++."
type: docs
weight: 100
url: /es/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Cuando se sobrescribe en una clase derivada, asigna un URI a un objeto que contiene el recurso real.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | La URI devuelta por la llamada a [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| rol | String | Actualmente no se usa. |
| ofObjectToReturn | const TypeInfo\& | El tipo de objeto a devolver. La versión actual solo devuelve objetos Stream. |

### ReturnValue

Un objeto de flujo o **nullptr** si se especifica un tipo que no sea flujo.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
