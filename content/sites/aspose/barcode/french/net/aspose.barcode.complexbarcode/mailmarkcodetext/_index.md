---
title: MailmarkCodetext
second_title: Référence de l'API Aspose.BarCode pour .NET
description: Classe pour encoder et décoder le texte intégré dans le code Royal Mailmark à 4 états.
type: docs
weight: 380
url: /fr/net/aspose.barcode.complexbarcode/mailmarkcodetext/
---
## MailmarkCodetext class

Classe pour encoder et décoder le texte intégré dans le code Royal Mailmark à 4 états.

```csharp
public sealed class MailmarkCodetext : IComplexCodetext
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [MailmarkCodetext](mailmarkcodetext)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| [Class](../../aspose.barcode.complexbarcode/mailmarkcodetext/class) { get; set; } | "0" - Null ou Test "1" - 1C (Retail) "2" - 2C (Retail) "3" - 3C (Retail) "4" - Premium (RetailPublishing Mail) (pour une éventuelle utilisation future) "5" - Différé (Retail) "6" - Air (Retail) (pour une utilisation future potentielle) "7" - Surface (Retail) (pour une utilisation future potentielle) "8" - Premium (Accès au réseau) "9" - Standard (accès réseau) |
| [DestinationPostCodePlusDPS](../../aspose.barcode.complexbarcode/mailmarkcodetext/destinationpostcodeplusdps) { get; set; } | Le PC et le DP doivent respecter un format PAF. Chaîne de neuf caractères désignant le "XY11" international (notez les 5 espaces à la fin) ou un motif de caractères désignant un code de tri domestique. Un code de tri domestique est constitué d'un code postal sortant, un code postal d'arrivée et un suffixe de point de livraison. |
| [Format](../../aspose.barcode.complexbarcode/mailmarkcodetext/format) { get; set; } | "0" – Nul ou Test "1" – Lettre "2" – Grande lettre |
| [ItemID](../../aspose.barcode.complexbarcode/mailmarkcodetext/itemid) { get; set; } | La valeur maximale est 99999999. |
| [SupplychainID](../../aspose.barcode.complexbarcode/mailmarkcodetext/supplychainid) { get; set; } | Les valeurs maximales sont 99 pour le code-barres C et 999999 pour le code-barres L. |
| [VersionID](../../aspose.barcode.complexbarcode/mailmarkcodetext/versionid) { get; set; } | Actuellement "1" - Pour le code-barres Mailmark (0 et 2 à 9 et A à Z de réserve pour une utilisation future) |

## Méthodes

| Nom | La description |
| --- | --- |
| [GetBarcodeType](../../aspose.barcode.complexbarcode/mailmarkcodetext/getbarcodetype)() | Obtient le type de code-barres. |
| [GetConstructedCodetext](../../aspose.barcode.complexbarcode/mailmarkcodetext/getconstructedcodetext)() | Construire un texte de code à partir des données Mailmark. |
| [InitFromString](../../aspose.barcode.complexbarcode/mailmarkcodetext/initfromstring)(string) | Initialise les données Mailmark à partir du texte de code construit. |

### Voir également

* interface [IComplexCodetext](../icomplexcodetext)
* espace de noms [Aspose.BarCode.ComplexBarcode](../../aspose.barcode.complexbarcode)
* Assemblée [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
