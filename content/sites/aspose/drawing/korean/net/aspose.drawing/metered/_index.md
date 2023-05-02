---
title: Class Metered
second_title: .NET API 참조용 Aspose.Drawing
description: Aspose.Drawing.Metered 수업. 측정 키를 설정하는 방법을 제공합니다.
type: docs
weight: 20
url: /ko/net/aspose.drawing/metered/
---
## Metered class

측정 키를 설정하는 방법을 제공합니다.

```csharp
public sealed class Metered : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Metered](metered/)() | 의 새 인스턴스를 초기화합니다.`Metered` 클래스. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Dispose](../../aspose.drawing/metered/dispose/)() | 관리되지 않는 리소스 해제, 해제 또는 재설정과 관련된 응용 프로그램 정의 작업을 수행합니다. |
| [SetMeteredKey](../../aspose.drawing/metered/setmeteredkey/)(string, string) | 측정된 공개 및 개인 키를 설정합니다 |
| static [GetConsumptionCredit](../../aspose.drawing/metered/getconsumptioncredit/)() | 소비 크레딧을 가져옵니다. |
| static [GetConsumptionQuantity](../../aspose.drawing/metered/getconsumptionquantity/)() | 사용 파일 크기를 가져옵니다. |

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

구성 요소 jar 파일:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### 또한보십시오

* 네임스페이스 [Aspose.Drawing](../../aspose.drawing/)
* 집회 [Aspose.Drawing](../../)


