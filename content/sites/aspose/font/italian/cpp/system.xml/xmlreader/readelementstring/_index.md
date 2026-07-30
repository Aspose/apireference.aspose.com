---
title: "System::Xml::XmlReader::ReadElementString metodo"
linktitle: "ReadElementString"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::ReadElementString metodo. Legge un elemento solo di testo. Tuttavia, si consiglia di utilizzare invece il metodo XmlReader::ReadElementContentAsString, poiché offre un modo più semplice per gestire questa operazione in C++."
type: docs
weight: 6400
url: /it/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Legge un elemento solo di testo. Tuttavia, è consigliato utilizzare invece il metodo [XmlReader::ReadElementContentAsString](../readelementcontentasstring/), perché fornisce un modo più semplice per gestire questa operazione.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Il testo contenuto nell'elemento letto. Una stringa vuota se l'elemento è vuoto.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Verifica che i valori [XmlReader::get_LocalName](../get_localname/) e [XmlReader::get_NamespaceURI](../get_namespaceuri/) dell'elemento trovato corrispondano alle stringhe fornite prima di leggere un elemento solo di testo. Tuttavia, è consigliato utilizzare invece il metodo [XmlReader::ReadElementContentAsString](../readelementcontentasstring/), perché fornisce un modo più semplice per gestire questa operazione.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localname | Stringa | Il nome locale da verificare. |
| ns | Stringa | L'URI dello spazio dei nomi da verificare. |

### ReturnValue

Il testo contenuto nell'elemento letto. Una stringa vuota se l'elemento è vuoto.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String) method


Verifica che il valore [XmlReader::get_Name](../get_name/) dell'elemento trovato corrisponda alla stringa fornita prima di leggere un elemento solo di testo. Tuttavia, è consigliato utilizzare invece il metodo [XmlReader::ReadElementContentAsString](../readelementcontentasstring/), perché fornisce un modo più semplice per gestire questa operazione.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome da verificare. |

### ReturnValue

Il testo contenuto nell'elemento letto. Una stringa vuota se l'elemento è vuoto.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
