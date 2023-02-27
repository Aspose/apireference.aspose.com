---
title: Class Metered
second_title: .NET API 참조용 Aspose.OCR
description: Aspose.OCR.Metered 수업. 측정 키를 설정하는 방법을 제공합니다.
type: docs
weight: 150
url: /ko/net/aspose.ocr/metered/
---
## Metered class

측정 키를 설정하는 방법을 제공합니다.

```csharp
public class Metered
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Metered](metered/)() | 기본 생성자입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [SetMeteredKey](../../aspose.ocr/metered/setmeteredkey/)(string, string) | 측정된 공개 및 개인 키를 설정합니다 |
| static [GetConsumptionCredit](../../aspose.ocr/metered/getconsumptioncredit/)() | 소비 credit 가져오기 |
| static [GetConsumptionQuantity](../../aspose.ocr/metered/getconsumptionquantity/)() | 소비 파일 크기 가져오기 |

### 예

이 예에서는 측정된 공용 및 개인 키 를 설정하려고 시도합니다.

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

### 또한보십시오

* 네임스페이스 [Aspose.OCR](../../aspose.ocr/)
* 집회 [Aspose.OCR](../../)


