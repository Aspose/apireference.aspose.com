---
title: "Méthode System::Xml::XmlSecureResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlSecureResolver::ResolveUri. Résout l'URI absolu à partir des URI de base et relatives en appelant ResolveUri sur le XmlResolver sous-jacent en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Résout l'URI absolu à partir des URI de base et relatives en appelant **ResolveUri** sur le [XmlResolver](../../xmlresolver/) sous-jacent.

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L’URI de base utilisée pour résoudre l’URI relative. |
| relativeUri | String | L’URI à résoudre. L’URI peut être absolue ou relative. Si elle est absolue, cette valeur remplace effectivement la valeur **baseUri**. Si elle est relative, elle se combine avec **baseUri** pour former une URI absolue. |

### ReturnValue

L'URI absolu ou **nullptr** si l'URI relatif ne peut pas être résolu (renvoyé en appelant **ResolveUri** sur le [XmlResolver](../../xmlresolver/) sous-jacent).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
