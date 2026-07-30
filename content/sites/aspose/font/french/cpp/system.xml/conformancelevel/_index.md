---
title: "enum System::Xml::ConformanceLevel"
linktitle: "Niveau de conformité"
second_title: "Aspose.Font pour C++"
description: "enum System::Xml::ConformanceLevel. Spécifie le niveau de vérification d'entrée ou de sortie que les objets XmlReader et XmlWriter effectuent en C++."
type: docs
weight: 4600
url: /fr/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Spécifie le niveau de vérification d'entrée ou de sortie que les objets [XmlReader](../xmlreader/) et [XmlWriter](../xmlwriter/) effectuent.

```cpp
enum class ConformanceLevel
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Auto | 0 | L'objet [XmlReader](../xmlreader/) ou [XmlWriter](../xmlwriter/) détecte automatiquement s'il faut effectuer une vérification au niveau du document ou au niveau du fragment, et effectue la vérification appropriée. Si vous encapsulez un autre objet [XmlReader](../xmlreader/) ou [XmlWriter](../xmlwriter/), l'objet externe n'effectue aucune vérification de conformité supplémentaire. La vérification de conformité est laissée à l'objet sous-jacent. |
| Fragment | 1 | Les données XML sont un [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), tel que défini par le W3C. Ce niveau de conformité représente un document XML qui peut ne pas avoir d'élément racine mais qui est sinon bien formé. Ce niveau de vérification garantit que le flux lu ou écrit peut être consommé par n'importe quel processeur comme une [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Les données XML sont conformes aux règles d'un [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), tel que défini par le W3C. Ce niveau de vérification garantit que le flux lu ou écrit peut être consommé par n'importe quel processeur comme un [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
