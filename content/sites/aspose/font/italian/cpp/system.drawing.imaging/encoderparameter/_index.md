---
title: "System::Drawing::Imaging::EncoderParameter classe"
linktitle: "EncoderParameter"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::EncoderParameter class. Funziona come un contenitore usato per passare valori a un codificatore di immagini. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Funziona come un contenitore usato per passare valori a un codificatore di immagini. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class EncoderParameter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta una frazione. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un intervallo di valori interi. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un intervallo di frazioni. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Costruisce una nuova istanza della classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di valori. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di valori. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di valori. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di frazioni. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di intervalli di interi. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta un array di intervalli di frazioni. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Costruisce una nuova istanza della classe [EncoderParameter](./) che rappresenta il numero specificato di valori del tipo specificato, letti dal buffer specificato. |
| [get_Encoder](./get_encoder/)() const | Restituisce l'oggetto [Encoder](../encoder/) associato all'attuale oggetto [EncoderParameter](./). |
| [get_NumberOfValues](./get_numberofvalues/)() const | Restituisce il numero del valore rappresentato dall'oggetto corrente. |
| [get_Type](./get_type/)() const | Restituisce il tipo del valore (o dei valori) rappresentato dall'oggetto corrente. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Associa l'oggetto [Encoder](../encoder/) specificato con l'oggetto [EncoderParameter](./) corrente. |
| [~EncoderParameter](./~encoderparameter/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
