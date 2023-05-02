---
title: Class Icon
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Icon 수업. 개체를 나타내는 데 사용되는 작은 비트맵 이미지인 Windows 아이콘을 나타냅니다. 아이콘의 크기는 시스템에 의해 결정되지만 아이콘은 투명한 비트맵으로 생각할 수 있습니다.
type: docs
weight: 570
url: /ko/net/system.drawing/icon/
---
## Icon class

개체를 나타내는 데 사용되는 작은 비트맵 이미지인 Windows 아이콘을 나타냅니다. 아이콘의 크기는 시스템에 의해 결정되지만 아이콘은 투명한 비트맵으로 생각할 수 있습니다.

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 데이터 스트림의 클래스. |
| [Icon](icon/#constructor_5)(string) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 파일 이름의 클래스. |
| [Icon](icon/#constructor_1)(Icon, Size) | 의 새 인스턴스를 초기화합니다.`Icon` 클래스를 호출하고 요청된 크기와 일치하는 아이콘 버전을 찾으려고 시도합니다. |
| [Icon](icon/#constructor_4)(Stream, Size) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 stream. 에서 지정된 크기의 클래스 |
| [Icon](icon/#constructor_7)(string, Size) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 파일에서 지정된 크기의 클래스. |
| [Icon](icon/#constructor_8)(Type, string) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 assembly. 에 있는 리소스의 클래스 |
| [Icon](icon/#constructor)(Icon, int, int) | 의 새 인스턴스를 초기화합니다.`Icon` 클래스를 호출하고 요청된 크기와 일치하는 아이콘 버전을 찾으려고 시도합니다.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 데이터 스트림의 클래스와 지정된 너비 및 높이. |
| [Icon](icon/#constructor_6)(string, int, int) | 의 새 인스턴스를 초기화합니다.`Icon` 지정된 파일에서 지정된 너비와 높이의 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | 이에 대한 핸들을 가져옵니다.Icon . 이것은 핸들의 복사본이 아닙니다. 해제하지 마십시오. |
| [Height](../../system.drawing/icon/height/) { get; } | 이것의 높이를 얻습니다.Icon . |
| [Size](../../system.drawing/icon/size/) { get; } | 이것의 크기를 얻습니다.Icon . |
| [Width](../../system.drawing/icon/width/) { get; } | 이것의 너비를 얻습니다.Icon . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | 지정된 파일에 포함된 이미지의 아이콘 표현을 반환합니다. |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | GDI+를 만듭니다.Icon 지정된 Windows 핸들에서 아이콘(HICON)으로. |
| [Clone](../../system.drawing/icon/clone/)() | 복제Icon , 중복 이미지 생성. |
| [Dispose](../../system.drawing/icon/dispose/)() | 관리되지 않는 리소스 해제, 해제 또는 재설정과 관련된 응용 프로그램 정의 작업을 수행합니다. |
| [Save](../../system.drawing/icon/save/)(Stream) | 저장Icon 지정된 출력으로Stream . |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | 이것을 변환Icon GDI+로Bitmap . |
| override [ToString](../../system.drawing/icon/tostring/)() | 다음을 설명하는 사람이 읽을 수 있는 문자열을 가져옵니다.Icon . |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


