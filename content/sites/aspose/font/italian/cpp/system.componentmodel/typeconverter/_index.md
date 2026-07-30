---
title: "System::ComponentModel::TypeConverter class"
linktitle: "TypeConverter"
second_title: "Aspose.Font per C++"
description: "System::ComponentModel::TypeConverter class. Classe che gestisce la conversione di tipo nel modello di componenti. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Classe che gestisce la conversione di tipo nel modello di componenti. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class TypeConverter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Converte una stringa invariata in un oggetto. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Converte una stringa invariata in un oggetto. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Converte un oggetto in una stringa invariata. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Converte un oggetto in una stringa invariata. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Converte un oggetto in una stringa. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Converte un oggetto in una stringa. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Converte un oggetto in una stringa. |
| [TypeConverter](./typeconverter/)() | Informazioni RTTI. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
