---
title: "System::Drawing::Imaging::EncoderParameter classe"
linktitle: "EncoderParameter"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Imaging::EncoderParameter classe. Sert de conteneur utilisé pour transmettre des valeurs à un encodeur d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Sert de conteneur utilisé pour transmettre des valeurs à un encodeur d'image. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class EncoderParameter : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente une fraction. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente une plage de valeurs entières. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente une plage de fractions. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Construit une nouvelle instance de la classe [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de valeurs. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de valeurs. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de valeurs. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de fractions. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de plages d'entiers. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente un tableau de plages de fractions. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Construit une nouvelle instance de la classe [EncoderParameter](./) qui représente le nombre spécifié de valeurs du type spécifié qui sont lues depuis le tampon spécifié. |
| [get_Encoder](./get_encoder/)() const | Renvoie l'objet [Encoder](../encoder/) associé à l'objet [EncoderParameter](./) actuel. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Renvoie le nombre de valeur représentée par l'objet actuel. |
| [get_Type](./get_type/)() const | Renvoie le type de la ou des valeurs représentées par l'objet actuel. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Associe l'objet [Encoder](../encoder/) spécifié à l'objet [EncoderParameter](./) actuel. |
| [~EncoderParameter](./~encoderparameter/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
