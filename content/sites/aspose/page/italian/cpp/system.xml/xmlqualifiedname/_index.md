---
title: "System::Xml::XmlQualifiedName classe"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlQualifiedName classe. Rappresenta un nome qualificato XML in C++."
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
| [get_Namespace](./get_namespace/)() const | Restituisce una rappresentazione stringa dello spazio dei nomi del [XmlQualifiedName](./). |
| [GetHashCode](./gethashcode/)() const override | Restituisce il codice hash per il [XmlQualifiedName](./). |
| static [ToString](./tostring/)(const String\&, const String\&) | Restituisce il valore stringa del [XmlQualifiedName](./). |
| [ToString](./tostring/)() const override | Restituisce il valore stringa del [XmlQualifiedName](./). |
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



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
