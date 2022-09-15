---
title: EncoderParameter
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Utilisé pour transmettre une valeur ou un tableau de valeurs à un encodeur dimage.
type: docs
weight: 700
url: /fr/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Utilisé pour transmettre une valeur ou un tableau de valeurs à un encodeur d'image.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [EncoderParameter](encoderparameter#constructor)(Encoder, byte) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter) classe avec le spécifiéEncoder object et un entier 8 bits non signé. Définit leValueType propriété àValueTypeByte , et définit leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_2)(Encoder, byte[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un tableau d'entiers 8 bits non signés. Définit l'objetValueType propriété àValueTypeByte , et définit leNumberOfValues propriété au nombre d'éléments dans le tableau. |
| [EncoderParameter](encoderparameter#constructor_11)(Encoder, long) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un entier 64 bits. Définit leValueType propriété àValueTypeLong (32 bits) et définit the NumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_13)(Encoder, long[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un tableau d'entiers 64 bits. Définit leValueType propriété àValueTypeLong (32 bits) et sets leNumberOfValues propriété au nombre d'éléments dans le tableau. |
| [EncoderParameter](encoderparameter#constructor_4)(Encoder, short) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un entier 16 bits. Définit leValueType propriété àValueTypeShort , et définit leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_5)(Encoder, short[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un tableau d'entiers 16 bits. Définit leValueType propriété àValueTypeShort , et définit the NumberOfValues propriété au nombre d'éléments dans le tableau. |
| [EncoderParameter](encoderparameter#constructor_15)(Encoder, string) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et une chaîne de caractères. La chaîne est convertie en une chaîne ASCII terminée par un caractère nul avant elle est stockée dans leEncoderParameter objet. Définit leValueType propriété àValueTypeAscii , et sets leNumberOfValues propriété à la longueur de la chaîne ASCII, y compris le terminateur NULL. |
| [EncoderParameter](encoderparameter#constructor_1)(Encoder, byte, bool) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et une valeur 8 bits. Définit leValueType propriété àValueTypeUndefined ouValueTypeByte , et définit leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_3)(Encoder, byte[], bool) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et un tableau d'octets. Définit leValueType propriété àValueTypeUndefined ou ValueTypeByte , et définit leNumberOfValues propriété au nombre d'éléments dans le tableau. |
| [EncoderParameter](encoderparameter#constructor_6)(Encoder, int, int) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoderobjet et une paire d'entiers 32 bits. La paire d'entiers représente une fraction, le premier entier étant le numérateur et le second entier étant le dénominateur. ValueType propriété àValueTypeRational , et définit leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_9)(Encoder, int[], int[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et deux tableaux d'entiers 32 bits. Les deux tableaux représentent un tableau de fractions. Définit leValueType propriété àValueTypeRational , et définit leNumberOfValuespropriété au nombre d'éléments dans la*numerator* tableau, qui doit être le même que le nombre d'éléments dans le*denominator* déployer. |
| [EncoderParameter](encoderparameter#constructor_12)(Encoder, long, long) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et une paire d'entiers 64 bits. La paire d'entiers représente une plage d'entiers, le premier entier étant le plus petit nombre de la plage et le second entier étant le plus grand nombre de la plage. Définit leValueType propriété àValueTypeLongRange , et définit leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_14)(Encoder, long[], long[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et deux tableaux d'entiers 64 bits. Les deux tableaux représentent un tableau de plages d'entiers. Définit leValueType propriété àValueTypeLongRange , et définit leNumberOfValuespropriété au nombre d'éléments dans la*rangebegin* tableau, qui doit être le même que le nombre d'éléments dans le*rangeend* tableau. |
| [EncoderParameter](encoderparameter#constructor_7)(Encoder, int, int, int) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et trois entiers qui spécifient le nombre de valeurs, le type de données des valeurs, et un pointeur vers les valeurs stockées dans leEncoderParameter objet. |
| [EncoderParameter](encoderparameter#constructor_8)(Encoder, int, int, int, int) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et quatre entiers 32 bits. Les quatre entiers représentent une plage de fractions. Les deux premiers entiers représentent la plus petite fraction de la plage et les deux entiers restants représentent la plus grande fraction de la plage. Définit leValueType propriété to ValueTypeRationalRange , et sets leNumberOfValues propriété à 1. |
| [EncoderParameter](encoderparameter#constructor_10)(Encoder, int[], int[], int[], int[]) | Initialise une nouvelle instance du[`EncoderParameter`](../encoderparameter)classe avec le spécifié Encoder objet et quatre tableaux d'entiers 32 bits. Les quatre tableaux représentent un tableau de plages rationnelles. Une plage rationnelle est l'ensemble de toutes les fractions d'une valeur fractionnaire minimale à une valeur fractionnaire maximale. Définit leValueType propriété àValueTypeRationalRange , et définit leNumberOfValues propriété au nombre d'éléments dans le*numerator1* tableau, qui doit être le même que le nombre d'éléments dans les trois autres tableaux. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder) { get; set; } | Obtient ou définit leEncoder objet associé à ceEncoderParameter objet. LeEncoder L'objet encapsule l'identificateur global unique (GUID) qui spécifie la catégorie (par exempleQuality ,ColorDepth , ouCompression ) du paramètre stocké dans ceEncoderParameter objet. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues) { get; } | Obtient le nombre d'éléments dans le tableau de valeurs stockées dans ceEncoderParameter objet. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose)() | Libère toutes les ressources utilisées par ceEncoderParameter objet. |

### Voir également

* espace de noms [System.Drawing.Imaging](../../system.drawing.imaging)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
