---
title: "System::Xml::Serialization::IXmlSerializable classe"
linktitle: "IXmlSerializable"
second_title: "Aspose.Font per C++"
description: "System::Xml::Serialization::IXmlSerializable classe. Fornisce una formattazione personalizzata per la serializzazione e deserializzazione XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Fornisce una formattazione personalizzata per la serializzazione e deserializzazione XML. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Un oggetto XmlSchema che descrive la rappresentazione XML dell'oggetto restituito dal metodo [WriteXml()](./writexml/) e accettato dal metodo [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Deserializza l'oggetto dalla sua rappresentazione XML. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Serializza l'oggetto corrente in una rappresentazione XML. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
