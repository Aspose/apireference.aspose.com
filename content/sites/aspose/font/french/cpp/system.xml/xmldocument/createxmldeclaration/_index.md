---
title: "Méthode System::Xml::XmlDocument::CreateXmlDeclaration"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlDocument::CreateXmlDeclaration. Crée un nœud XmlDeclaration avec les valeurs spécifiées en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Crée un nœud [XmlDeclaration](../../xmldeclaration/) avec les valeurs spécifiées.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| version | const String\& | La version doit être "1.0". |
| encoding | const String\& | La valeur de l'attribut d'encodage. Il s'agit de l'encodage utilisé lorsque vous enregistrez le [XmlDocument](../) dans un fichier ou un flux ; par conséquent, il doit être défini sur une chaîne prise en charge par la classe [Text::Encoding](../../../system.text/encoding/), sinon "XmlDocument::Save(String)" échoue. Si c'est **nullptr** ou [String::Empty](../../../system/string/empty/), la méthode [XmlDocument::Save](../save/) n'écrit pas d'attribut d'encodage dans la déclaration XML et, par conséquent, l'encodage par défaut, UTF-8, est utilisé. |
| standalone | const String\& | La valeur doit être soit "yes" soit "no". Si c'est **nullptr** ou [String::Empty](../../../system/string/empty/), la méthode [XmlDocument::Save](../save/) n'écrit pas d'attribut standalone dans la déclaration XML. |

### ReturnValue

Le nouveau nœud [XmlDeclaration](../../xmldeclaration/).
## Remarques



Remarque : si le [XmlDocument](../) est enregistré dans un TextWriter ou un [XmlTextWriter](../../xmltextwriter/), cette valeur d'encodage est ignorée. À la place, l'encodage du TextWriter ou du [XmlTextWriter](../../xmltextwriter/) est utilisé. Cela garantit que le XML écrit peut être relu en utilisant le bon encodage.
## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
