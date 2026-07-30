---
title: "Constructeur System::Xml::XmlTextWriter::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Xml::XmlTextWriter::XmlTextWriter. Crée une instance de la classe XmlTextWriter en utilisant le flux et l’encodage spécifiés en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Crée une instance de la classe [XmlTextWriter](../) en utilisant le flux et l’encodage spécifiés.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |
| encoding | const SharedPtr\<Text::Encoding\>\& | L’encodage à générer. Si l’encodage est **nullptr**, il écrit le flux en UTF-8 et omet l’attribut d’encodage du **ProcessingInstruction**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Crée une instance de la classe [XmlTextWriter](../) en utilisant le TextWriter spécifié.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter dans lequel écrire. On suppose que le TextWriter est déjà configuré avec le bon encodage. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Crée une instance de la classe [XmlTextWriter](../) en utilisant le fichier spécifié.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| filename | const String\& | Le nom de fichier dans lequel écrire. Si le fichier existe, il le tronque et le remplace par le nouveau contenu. |
| encoding | const SharedPtr\<Text::Encoding\>\& | L’encodage à générer. Si l’encodage est **nullptr**, il écrit le fichier en UTF-8 et omet l’attribut d’encodage du **ProcessingInstruction**. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
