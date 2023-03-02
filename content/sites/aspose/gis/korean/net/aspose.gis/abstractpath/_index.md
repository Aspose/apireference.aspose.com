---
title: Class AbstractPath
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.AbstractPath 수업. 안추상경로 파일 시스템과 유사한 환경에서 고유한 위치를 지정하는 클래스의 기본 클래스입니다. 로컬 파일 시스템과 같은  원격 파일 저장소 또는 ZIP 아카이브 등.
type: docs
weight: 10
url: /ko/net/aspose.gis/abstractpath/
---
## AbstractPath class

안`추상경로` 파일 시스템과 유사한 환경에서 고유한 위치를 지정하는 클래스의 기본 클래스입니다. 로컬 파일 시스템과 같은 , 원격 파일 저장소 또는 ZIP 아카이브 등.

```csharp
public abstract class AbstractPath
```

## 속성

| 이름 | 설명 |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | 이 위치의 문자열 표현을 가져옵니다.`추상경로` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | 디렉토리 수준을 구분하는 데 사용되는 구분 문자를 가져옵니다.[`Location`](./location/) 끈. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | 생성`AbstractPath` 로컬 파일 시스템의 위치를 나타냅니다. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | 생성`AbstractPath` 에서Stream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | 이것을 결합`AbstractPath` 지정된 경로 구성요소 포함. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | 이 경로가 가리키는 파일을 삭제합니다. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | 이 확장자를 반환합니다.`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | 이 파일 이름과 확장자를 반환합니다.`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | 이 파일 이름을 반환합니다.`AbstractPath` 확장자 없이. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | 이 경로가 읽기 위해 열 수 있는 기존 파일을 가리키는지 여부를 나타내는 값을 가져옵니다. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | 이 안에 있는 경로를 반환합니다.`추상경로` , 디렉토리인 경우. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | 이것을 엽니다`추상경로`파일로. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | 새 항목을 반환합니다.`AbstractPath` 파일 확장자가 지정된 값으로 변경되었습니다. |

### 비고

안`추상경로` 로컬 파일 시스템의 위치, 원격 filesystem 의 위치 또는 Azure Blob 저장소와 같은 외부 저장소 등을 지정할 수 있습니다. 위치는 존재하거나 존재하지 않는 파일류 객체, 디렉토리류 객체를 가리키거나 그것이 속한 환경에 합당한 다른 의미를 가질 수 있습니다. 예를 들어,`추상경로` 로컬 파일 시스템의 위치를 나타내는 상속자는 기존 파일, 디렉토리 또는 아직 생성되지 않은 파일 시스템의 위치를 가리킬 수 있습니다. 새로운 파일 시스템과 유사한 스토리지를 사용할 수 있도록`Aspose.GIS` 이 class 를 상속하고 추상 메서드를 구현해야 합니다.

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


