---
title: "Classe System::Xml::XmlQualifiedName"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlQualifiedName. Rappresenta un nome qualificato XML in C++."
type: docs
weight: 3200
url: /it/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Rappresenta un nome qualificato XML.

```cpp
class XmlQualifiedName : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Determina se l'oggetto [XmlQualifiedName](./) specificato è uguale all'oggetto [XmlQualifiedName](./) corrente. |
| [get_IsEmpty](./get_isempty/)() const | Restituisce un valore che indica se il [XmlQualifiedName](./) è vuoto. |
| [get_Name](./get_name/)() const | Restituisce una rappresentazione stringa del nome qualificato del [XmlQualifiedName](./). |
| [get_Namespace](./get_namespace/)() const | Restituisce una rappresentazione stringa del namespace del [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Restituisce il codice hash per il [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Restituisce il valore stringa di [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Restituisce il valore stringa di [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)() | Inizializza una nuova istanza della classe [XmlQualifiedName](./). |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Inizializza una nuova istanza della classe [XmlQualifiedName](./) con il nome specificato. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Inizializza una nuova istanza della classe [XmlQualifiedName](./) con il nome e lo spazio dei nomi specificati. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Fornisce un [XmlQualifiedName](./) vuoto. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
