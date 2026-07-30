---
title: "System::Drawing::FontConverter classe"
linktitle: "FontConverter"
second_title: "Aspose.Font per C++"
description: "System::Drawing::FontConverter classe. Converte gli oggetti Font da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.drawing/fontconverter/
---
## FontConverter class


Converte gli oggetti [Font](../font/) da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class FontConverter : public System::ComponentModel::TypeConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Converte gli oggetti. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Converte l'oggetto in un tipo specifico. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
## Vedi anche

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
