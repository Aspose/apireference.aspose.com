---
title: "Classe System::ComponentModel::EnumConverter"
linktitle: "EnumConverter"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::EnumConverter. Classe fittizia per far compilare il codice tradotto che utilizza EnumConverter. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Classe fittizia per far compilare il codice tradotto che utilizza EnumConverter. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Verifica se i tipi sono convertibili; non implementato. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Verifica se i tipi sono convertibili; non implementato. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Esegue la conversione reale del tipo; non implementato. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Esegue la conversione reale del tipo; non implementato. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | Informazioni RTTI. |
| [get_EnumType](./get_enumtype/)() | Ottiene il tipo enum con cui lavora [EnumConverter](./); non implementato. |
## Vedi anche

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
