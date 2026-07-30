---
title: "System::Xml::XmlUrlResolver::ResolveUri méthode"
linktitle: "ResolveUri"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlUrlResolver::ResolveUri méthode. Résout l’URI absolu à partir des URI de base et relatives en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Résout l'URI absolu à partir des URI de base et relatifs.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | L’URI de base utilisée pour résoudre l’URI relative. |
| relativeUri | String | L’URI à résoudre. L’URI peut être absolue ou relative. Si elle est absolue, cette valeur remplace effectivement la valeur **baseUri**. Si elle est relative, elle se combine avec **baseUri** pour former une URI absolue. |

### ReturnValue

L’URI absolue, ou **nullptr** si l’URI relative ne peut pas être résolue.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
