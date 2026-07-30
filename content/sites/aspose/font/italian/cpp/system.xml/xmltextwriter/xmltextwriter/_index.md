---
title: "System::Xml::XmlTextWriter::XmlTextWriter costruttore"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter costruttore. Crea un'istanza della classe XmlTextWriter utilizzando lo stream e la codifica specificati in C++."
type: docs
weight: 100
url: /it/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Crea un'istanza della classe [XmlTextWriter](../) utilizzando lo stream e la codifica specificati.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Lo stream su cui si desidera scrivere. |
| encoding | const SharedPtr\<Text::Encoding\>\& | La codifica da generare. Se la codifica è **nullptr** scrive lo stream come UTF-8 e omette l'attributo di codifica dall'**ProcessingInstruction**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Crea un'istanza della classe [XmlTextWriter](../) utilizzando il TextWriter specificato.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | Il TextWriter su cui scrivere. Si presume che il TextWriter sia già impostato con la codifica corretta. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Crea un'istanza della classe [XmlTextWriter](../) utilizzando il file specificato.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filename | const String\& | Il nome del file su cui scrivere. Se il file esiste, lo tronca e lo sovrascrive con il nuovo contenuto. |
| encoding | const SharedPtr\<Text::Encoding\>\& | La codifica da generare. Se la codifica è **nullptr** scrive il file come UTF-8 e omette l'attributo di codifica dall'**ProcessingInstruction**. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
