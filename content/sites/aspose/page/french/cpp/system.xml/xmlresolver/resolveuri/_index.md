---
title: "System::Xml::XmlResolver::ResolveUri méthode"
linktitle: "ResolveUri"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlResolver::ResolveUri méthode. Lorsqu'elle est remplacée dans une classe dérivée, résout l'URI absolu à partir des URI de base et relatives en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Lorsqu'elle est substituée dans une classe dérivée, résout l'URI absolu à partir de l'URI de base et des URI relatifs.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L’URI de base utilisée pour résoudre l’URI relative. |
| relativeUri | String | L’URI à résoudre. L’URI peut être absolue ou relative. Si elle est absolue, cette valeur remplace effectivement la valeur de **baseUri**. Si elle est relative, elle se combine avec **baseUri** pour former une URI absolue. |

### ReturnValue

L'URI absolu ou **nullptr** si l'URI relatif ne peut pas être résolu.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
