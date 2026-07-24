---
title: "System::Xml::XmlWriter::WriteStartElement method"
linktitle: "WriteStartElement"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlWriter::WriteStartElement method. Quando sovrascritto in una classe derivata, scrive un tag di apertura con il nome locale specificato in C++."
type: docs
weight: 3200
url: /it/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


Quando sovrascritto in una classe derivata, scrive un tag di avvio con il nome locale specificato.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'elemento. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


Quando sovrascritto in una classe derivata, scrive il tag di avvio specificato e lo associa allo spazio dei nomi fornito.

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | const String\& | Il nome locale dell'elemento. |
| ns | const String\& | L'URI del namespace da associare all'elemento. Se questo namespace è già in ambito e ha un prefisso associato, lo scrittore scrive automaticamente anche quel prefisso. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


Quando sovrascritto in una classe derivata, scrive il tag di avvio specificato e lo associa allo spazio dei nomi e al prefisso forniti.

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefisso | const String\& | Il prefisso di namespace dell'elemento. |
| localName | const String\& | Il nome locale dell'elemento. |
| ns | const String\& | L'URI del namespace da associare all'elemento. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
