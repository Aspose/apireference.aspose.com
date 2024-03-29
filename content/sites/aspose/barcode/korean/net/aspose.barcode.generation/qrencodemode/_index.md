---
title: QREncodeMode
second_title: .NET API 참조용 Aspose.BarCode
description: QR 바코드의 인코딩 모드. 라틴 기호 또는 숫자의 경우 CodeTextEncoding  Encoding.UTF8 유니코드 기호의 경우 Utf8BOM과 함께 Auto를 사용하는 것이 좋습니다.
type: docs
weight: 1150
url: /ko/net/aspose.barcode.generation/qrencodemode/
---
## QREncodeMode enumeration

QR 바코드의 인코딩 모드. 라틴 기호 또는 숫자의 경우 CodeTextEncoding = Encoding.UTF8, 유니코드 기호의 경우 Utf8BOM과 함께 Auto를 사용하는 것이 좋습니다.

```csharp
public enum QREncodeMode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Auto | `0` | 유니코드가 아닌 문자 집합인 코드 텍스트를 인코딩합니다. 유니코드 문자가 있으면 CodeTextEncoding. 에 설정된 값으로 코드 텍스트가 인코딩됩니다. |
| Bytes | `1` | 일반 바이트로 코드 텍스트를 인코딩합니다. 유니코드 문자를 감지하면 문자가 2바이트로 인코딩되며 낮은 바이트부터 시작됩니다. |
| Utf8BOM | `2` | 첫 번째 ByteOfMark 문자가 있는 UTF8 인코딩으로 코드 텍스트를 인코딩합니다. |
| Utf16BEBOM | `3` | 첫 번째 ByteOfMark 문자가 있는 UTF8 인코딩으로 코드 텍스트를 인코딩합니다. 일부 바코드 스캐너에서 문제가 될 수 있습니다. |
| ECIEncoding | `4` | ECIEncoding 속성에 설정된 값으로 코드 텍스트를 인코딩합니다. 일부 오래된(2006년 이전) 바코드 스캐너에서 문제가 될 수 있습니다. |
| ExtendedCodetext | `5` | FNC1 첫 번째 위치, FNC1 두 번째 위치 및 다중 ECI 모드를 지원하는 확장 채널 모드. |

### 또한보십시오

* 네임스페이스 [Aspose.BarCode.Generation](../../aspose.barcode.generation/)
* 집회 [Aspose.BarCode](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.BarCode.dll -->
