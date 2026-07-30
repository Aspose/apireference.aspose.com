---
title: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri"
linktitle: "ResolveUri"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri. Résout l’URI absolu à partir des URI de base et relatives en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Résout l'URI absolu à partir des URI de base et relatifs.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L’URI de base utilisée pour résoudre l’URI relative. |
| relativeUri | String | L’URI à résoudre. L’URI peut être absolue ou relative. Si elle est absolue, cette valeur remplace effectivement la valeur **baseUri**. Si elle est relative, elle se combine avec **baseUri** pour former une URI absolue. |

### ReturnValue

Le [Uri](../../../system/uri/) représentant l’URI absolu ou **nullptr** si l’URI relatif ne peut pas être résolu.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
