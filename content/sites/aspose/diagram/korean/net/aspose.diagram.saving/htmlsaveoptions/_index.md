---
title: HTMLSaveOptions
second_title: .NET API 참조용 Aspose.Diagram
description: 다이어그램 페이지를 HTML로 렌더링할 때 추가 옵션을 지정할 수 있습니다.
type: docs
weight: 3240
url: /ko/net/aspose.diagram.saving/htmlsaveoptions/
---
## HTMLSaveOptions class

다이어그램 페이지를 HTML로 렌더링할 때 추가 옵션을 지정할 수 있습니다.

```csharp
public class HTMLSaveOptions : RenderingSaveOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [HTMLSaveOptions](htmlsaveoptions/)() | 문서를 저장하는 데 사용할 수 있는 이 클래스의 새 인스턴스를 초기화합니다.[`HTML`](../../aspose.diagram/savefileformat/) 형식. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Area](../../aspose.diagram.saving/renderingsaveoptions/area/) { get; set; } | 저장될 모양의 영역을 가져오거나 설정합니다. |
| virtual [DefaultFont](../../aspose.diagram.saving/saveoptions/defaultfont/) { get; set; } | 다이어그램의 문자가 유니코드이고 올바른 글꼴 값으로 설정되지 않았거나 글꼴이 로컬에 설치되지 않은 경우 pdf, 이미지 또는 XPS에서 블록으로 나타날 수 있습니다. MingLiu 또는 MS Gothic과 같은 DefaultFont를 설정하여 이를 표시합니다 문자. |
| [EmfRenderSetting](../../aspose.diagram.saving/renderingsaveoptions/emfrendersetting/) { get; set; } | Emf 메타파일 렌더링 설정. |
| [EnlargePage](../../aspose.diagram.saving/renderingsaveoptions/enlargepage/) { get; set; } | 페이지 확대 여부를 지정합니다. |
| [ExportGuideShapes](../../aspose.diagram.saving/renderingsaveoptions/exportguideshapes/) { get; set; } | 가이드 모양을 내보낼 필요가 있는지 여부를 정의합니다. |
| [ExportHiddenPage](../../aspose.diagram.saving/htmlsaveoptions/exporthiddenpage/) { get; set; } | 숨겨진 페이지를 내보내야 하는지 여부를 정의합니다. |
| [IsExportComments](../../aspose.diagram.saving/renderingsaveoptions/isexportcomments/) { get; set; } | 주석을 내보낼 필요가 있는지 여부를 정의합니다. |
| [PageCount](../../aspose.diagram.saving/htmlsaveoptions/pagecount/) { get; set; } | HTML로 렌더링할 페이지 수를 가져오거나 설정합니다. 기본값은 다이어그램의 모든 페이지가 렌더링됨을 의미하는 MaxValue입니다. |
| [PageIndex](../../aspose.diagram.saving/htmlsaveoptions/pageindex/) { get; set; } | 렌더링할 첫 번째 페이지의 0 기반 인덱스를 가져오거나 설정합니다. 기본값은 0. 입니다. |
| [PageSize](../../aspose.diagram.saving/renderingsaveoptions/pagesize/) { get; set; } | 생성된 이미지의 페이지 크기를 가져오거나 설정합니다. Can be be[`PageSize`](../pagesize/) 또는 null. |
| [Resolution](../../aspose.diagram.saving/htmlsaveoptions/resolution/) { get; set; } | 생성된 html의 해상도를 인치당 도트 수로 가져오거나 설정합니다. |
| [SaveAsSingleFile](../../aspose.diagram.saving/htmlsaveoptions/saveassinglefile/) { get; set; } | html을 단일 파일로 저장할지 여부를 나타냅니다. 기본값은 false입니다. |
| [SaveForegroundPagesOnly](../../aspose.diagram.saving/htmlsaveoptions/saveforegroundpagesonly/) { get; set; } | 모든 페이지를 이미지로 저장할지 또는 전경으로만 저장할지 지정합니다. |
| override [SaveFormat](../../aspose.diagram.saving/htmlsaveoptions/saveformat/) { get; set; } | 이 저장 옵션 개체를 사용하는 경우 렌더링된 다이어그램 페이지가 저장되는 형식을 지정합니다. Can be[`HTML`](../../aspose.diagram/savefileformat/) 만. |
| [SaveTitle](../../aspose.diagram.saving/htmlsaveoptions/savetitle/) { get; set; } | 제목을 내보내야 하는지 여부를 정의합니다. |
| [SaveToolBar](../../aspose.diagram.saving/htmlsaveoptions/savetoolbar/) { get; set; } | toolbar 저장 여부를 지정합니다. 기본값은 true입니다. |
| [Shapes](../../aspose.diagram.saving/renderingsaveoptions/shapes/) { get; set; } | 렌더링할 모양을 가져오거나 설정합니다. 기본 개수는 0. 입니다. |
| [StreamProvider](../../aspose.diagram.saving/htmlsaveoptions/streamprovider/) { get; set; } | 개체 내보내기를 위한 IStreamProvider를 가져오거나 설정합니다. |
| [Title](../../aspose.diagram.saving/htmlsaveoptions/title/) { get; set; } | HTML로 렌더링할 다이어그램의 제목을 가져오거나 설정합니다. 제목이 null인 경우 Diagram.DocumentProperties.Title[`DocumentProperties`](../../aspose.diagram/documentproperties/) Title. 로 사용됩니다. Diagram.DocumentProperties.Title이 null이거나 비어 있으면 Diagram의 파일 이름이 Title. 로 사용됩니다. |
| [WarningCallback](../../aspose.diagram.saving/saveoptions/warningcallback/) { get; set; } | 경고 콜백을 가져오거나 설정합니다. |

### 또한보십시오

* class [RenderingSaveOptions](../renderingsaveoptions/)
* 네임스페이스 [Aspose.Diagram.Saving](../../aspose.diagram.saving/)
* 집회 [Aspose.Diagram](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Diagram.dll -->
