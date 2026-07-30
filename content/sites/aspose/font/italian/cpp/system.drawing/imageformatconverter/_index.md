---
title: "System::Drawing::ImageFormatConverter classe"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Font per C++"
description: "System::Drawing::ImageFormatConverter classe. Converte gli oggetti ImageFormat da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1400
url: /it/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


Converte gli oggetti ImageFormat da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Converte gli oggetti. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Converte gli oggetti. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Converte una stringa in un oggetto. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Converte l'oggetto in un tipo specifico. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| [ImageFormatConverter](./imageformatconverter/)() | Crea una nuova istanza di [ImageFormatConverter](./). |
## Vedi anche

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
