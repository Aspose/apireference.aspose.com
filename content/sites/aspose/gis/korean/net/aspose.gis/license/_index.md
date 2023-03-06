---
title: Class License
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.License 수업. 구성 요소에 라이선스를 부여하는 방법을 제공합니다.
type: docs
weight: 1270
url: /ko/net/aspose.gis/license/
---
## License class

구성 요소에 라이선스를 부여하는 방법을 제공합니다.

```csharp
public class License
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [License](license/)() | 기본 생성자입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense)(Stream) | 구성 요소에 라이선스를 부여합니다. |
| [SetLicense](../../aspose.gis/license/setlicense/#setlicense_1)(string) | 구성 요소에 라이선스를 부여합니다. |

### 예

이 예제에서는 구성 요소가 포함된 폴더, 호출 어셈블리가 포함된 폴더, 항목 어셈블리의 폴더에서 이름이 MyLicense.lic 인 라이센스 파일을 찾은 다음 호출 어셈블리의 임베디드 리소스.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


