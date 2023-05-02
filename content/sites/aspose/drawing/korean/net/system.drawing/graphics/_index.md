---
title: Class Graphics
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Graphics 수업. 도면 표면을 캡슐화합니다.
type: docs
weight: 530
url: /ko/net/system.drawing/graphics/
---
## Graphics class

도면 표면을 캡슐화합니다.

```csharp
public class Graphics : IDisposable
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip/) { get; set; } | 가져오거나 설정합니다.Region 이것의 그리기 영역을 제한하는Graphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds/) { get; } | 가져오기[`RectangleF`](../rectanglef/) 이것의 클리핑 영역을 제한하는 구조`Graphics` . |
| [CompositingMode](../../system.drawing/graphics/compositingmode/) { get; set; } | 합성된 이미지가 여기에 그려지는 방법을 지정하는 값을 가져오거나 설정합니다.Graphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality/) { get; set; } | 여기에 그려진 합성 이미지의 렌더링 품질을 가져오거나 설정합니다.Graphics . |
| [DpiX](../../system.drawing/graphics/dpix/) { get; } | 이것의 수평 해상도를 얻습니다.Graphics . |
| [DpiY](../../system.drawing/graphics/dpiy/) { get; } | 이것의 수직 해상도를 얻습니다.Graphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode/) { get; set; } | 이 그래픽과 관련된 보간 모드를 가져오거나 설정합니다. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty/) { get; } | 이 클리핑 영역이Graphics 비어 있습니다. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty/) { get; } | 이 클리핑 영역이 보이는지 여부를 나타내는 값을 가져옵니다.Graphics 비어 있습니다. |
| [PageScale](../../system.drawing/graphics/pagescale/) { get; set; } | 이에 대한 월드 단위와 페이지 단위 사이의 배율을 가져오거나 설정합니다.Graphics . |
| [PageUnit](../../system.drawing/graphics/pageunit/) { get; set; } | 이 페이지 좌표에 사용되는 측정 단위를 가져오거나 설정합니다.Graphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode/) { get; set; } | 이것을 렌더링하는 동안 픽셀이 오프셋되는 방법을 지정하는 값을 가져오거나 설정합니다.Graphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin/) { get; set; } | 이의 렌더링 원점을 가져오거나 설정합니다.Graphics 디더링 및 해치 브러시용. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode/) { get; set; } | 이 그래픽의 렌더링 품질을 가져오거나 설정합니다. |
| [TextContrast](../../system.drawing/graphics/textcontrast/) { get; set; } | 텍스트 렌더링을 위한 감마 보정 값을 가져오거나 설정합니다. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint/) { get; set; } | 이와 관련된 텍스트의 렌더링 모드를 가져오거나 설정합니다.Graphics . |
| [Transform](../../system.drawing/graphics/transform/) { get; set; } | 이에 대한 기하학적 세계 변환의 복사본을 가져오거나 설정합니다.Graphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds/) { get; } | 이 표시되는 클리핑 영역의 경계 사각형을 가져옵니다.Graphics . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd/)(IntPtr) | 새로 만들기Graphics 지정된 핸들에서 window. 로 |
| static [FromImage](../../system.drawing/graphics/fromimage/)(Image) | 지정된 이미지에서 새 그래픽을 만듭니다. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment/)(byte[]) | 현재에 설명을 추가합니다.Metafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer)() | 현재 상태로 그래픽 컨테이너를 저장합니다.Graphics 새 그래픽 컨테이너를 열고 사용합니다. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | 현재 상태로 그래픽 컨테이너를 저장합니다.Graphics 지정된 축척 변환으로 새 그래픽 컨테이너를 열고 사용합니다. |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | 현재 상태로 그래픽 컨테이너를 저장합니다.Graphics 지정된 축척 변환으로 새 그래픽 컨테이너를 열고 사용합니다. |
| [Clear](../../system.drawing/graphics/clear/)(Color) | 전체 드로잉 표면을 지우고 지정된 배경색으로 채웁니다. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_1)(Point, Point, Size) | 픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | 픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | 픽셀의 사각형에 해당하는 색상 데이터를 화면에서 화면의 드로잉 표면으로 비트 블록 전송을 수행합니다.Graphics . |
| [Dispose](../../system.drawing/graphics/dispose/)() | 이 그래픽에서 사용하는 모든 리소스를 해제합니다. |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc_1)(Pen, RectangleF, float, float) | RectangleF 구조로 지정된 타원의 일부를 나타내는 호를 그립니다. |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc)(Pen, float, float, float, float, float, float) | 좌표 쌍, 너비 및 높이로 지정된 타원의 일부를 나타내는 호를 그립니다. |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | 4개의 PointF 구조로 정의된 베지어 스플라인을 그립니다. |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier)(Pen, float, float, float, float, float, float, float, float) | 점을 나타내는 4개의 정렬된 좌표 쌍으로 정의된 베지어 스플라인을 그립니다. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers)(Pen, PointF[]) | 배열에서 일련의 베지어 스플라인을 그립니다.Point 구조. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers_1)(Pen, Point[]) | 배열에서 일련의 베지어 스플라인을 그립니다.PointF 구조. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve)(Pen, PointF[]) | 배열로 정의된 닫힌 기본 스플라인을 그립니다.PointF 구조. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_2)(Pen, Point[]) | 배열로 정의된 닫힌 기본 스플라인을 그립니다.Point 구조. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | 지정된 장력을 사용하여 PointF 구조 배열로 정의된 닫힌 기본 스플라인을 그립니다. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_3)(Pen, Point[], float, FillMode) | 배열로 정의된 닫힌 기본 스플라인을 그립니다.Point 지정된 장력을 사용하는 구조물. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve)(Pen, PointF[]) | 지정된 배열을 통해 기본 스플라인을 그립니다.PointF 구조. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_4)(Pen, Point[]) | 지정된 배열을 통해 기본 스플라인을 그립니다.Point 구조. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_3)(Pen, PointF[], float) | 지정된 배열을 통해 기본 스플라인을 그립니다.PointF 지정된 장력을 사용하는 구조물. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_6)(Pen, Point[], float) | 지정된 배열을 통해 기본 스플라인을 그립니다.Point 지정된 장력을 사용하는 구조물. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_1)(Pen, PointF[], int, int) | 지정된 배열을 통해 기본 스플라인을 그립니다.PointF 지정된 장력을 사용하는 구조. 도면은 배열의 시작 부분에서 오프셋을 시작합니다. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_2)(Pen, PointF[], int, int, float) | 지정된 배열을 통해 기본 스플라인을 그립니다.PointF 지정된 장력을 사용하는 구조. 도면은 배열의 시작 부분에서 오프셋을 시작합니다. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_5)(Pen, Point[], int, int, float) | 지정된 배열을 통해 기본 스플라인을 그립니다.Point 지정된 장력을 사용하는 구조. 도면은 배열의 시작 부분에서 오프셋을 시작합니다. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse_1)(Pen, RectangleF) | 경계 RectangleF로 정의된 타원을 그립니다. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse)(Pen, float, float, float, float) | 좌표 쌍, 높이 및 너비로 지정된 경계 사각형으로 정의된 타원을 그립니다. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon_1)(Icon, Rectangle) | 지정된 이미지를 그립니다.Icon 에서 지정한 지역 내에서Rectangle 구조. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon)(Icon, int, int) | 지정된 이미지를 그립니다.Icon 지정된 좌표에서. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched/)(Icon, Rectangle) | 지정된 이미지를 그립니다.Icon 이미지 크기를 조정하지 않고. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_6)(Image, Point) | 지정된 위치에서 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_7)(Image, PointF) | 지정된 것을 그립니다.Image , 지정된 위치에서 원래 물리적 크기를 사용합니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_8)(Image, PointF[]) | 지정된 것을 그립니다.Image 지정된 위치에 지정된 모양과 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_11)(Image, Point[]) | 지정된 것을 그립니다.Е:Image 지정된 위치에 지정된 모양과 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_14)(Image, Rectangle) | 지정된 위치에 지정된 크기로 지정된 이미지를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_20)(Image, RectangleF) | 지정된 위치에 지정된 크기로 지정된 이미지를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_3)(Image, float, float) | 지정된 것을 그립니다.Image , 지정된 위치에서 원래 물리적 크기를 사용합니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage)(Image, int, int) | 좌표 쌍으로 지정된 위치에 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | 지정된 이미지의 지정된 부분을 지정된 위치에 지정된 크기로 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | 지정된 부분을 그립니다.Image 지정된 위치에서 지정된 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | 지정된 이미지의 지정된 부분을 지정된 위치에 지정된 크기로 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | 지정된 이미지의 지정된 부분을 지정된 위치에 지정된 크기로 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_4)(Image, float, float, float, float) | 지정된 것을 그립니다.Image , 지정된 위치에서 지정된 크기로 원래 물리적 크기를 사용합니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | 지정된 위치에 이미지의 일부를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_1)(Image, int, int, int, int) | 지정된 위치에 지정된 크기로 지정된 이미지를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | 지정된 위치에 이미지의 일부를 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | 지정된 이미지의 지정된 부분을 지정된 위치에 지정된 크기로 그립니다. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | 지정된 부분을 그립니다.Image 지정된 위치에서 지정된 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | 지정된 부분을 그립니다.Image 지정된 위치에서 지정된 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | 지정된 부분을 그립니다.Image 지정된 위치에서 지정된 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | 지정된 부분을 그립니다.Image 지정된 위치에서 지정된 크기로. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | 지정된 이미지의 지정된 부분을 지정된 위치에 지정된 크기로 그립니다. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_2)(Image, Point) | 지정된 위치에 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_3)(Image, Rectangle) | 지정된 위치에 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled)(Image, int, int) | 좌표 쌍으로 지정된 위치에 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_1)(Image, int, int, int, int) | 좌표 쌍으로 지정된 위치에 원래 물리적 크기를 사용하여 지정된 이미지를 그립니다. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped/)(Image, Rectangle) | 크기 조정 없이 지정된 이미지를 그리고 필요한 경우 지정된 사각형에 맞게 자릅니다. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_2)(Pen, Point, Point) | 두 개를 연결하는 선을 그립니다.Point 구조. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_3)(Pen, PointF, PointF) | 두 개의 PointF 구조를 연결하는 선을 그립니다. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_1)(Pen, float, float, float, float) | 좌표 쌍으로 지정된 두 점을 연결하는 선을 그립니다. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline)(Pen, int, int, int, int) | 좌표 쌍으로 지정된 두 점을 연결하는 선을 그립니다. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines)(Pen, PointF[]) | 배열을 연결하는 일련의 선분을 그립니다.PointF 구조. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines_1)(Pen, Point[]) | 배열을 연결하는 일련의 선분을 그립니다.Point 구조. |
| [DrawPath](../../system.drawing/graphics/drawpath/)(Pen, GraphicsPath) | GraphicsPath를 그립니다. |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie_1)(Pen, RectangleF, float, float) | RectangleF 구조와 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 모양을 그립니다. |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie)(Pen, float, float, float, float, float, float) | 좌표 쌍, 너비, 높이 및 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 모양을 그립니다. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon)(Pen, PointF[]) | PointF 구조의 배열로 정의된 다각형을 그립니다. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon_1)(Pen, Point[]) | 배열로 정의된 다각형을 그립니다.Point 구조. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_2)(Pen, Rectangle) | Rectangle 구조로 지정된 사각형을 그립니다. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_1)(Pen, float, float, float, float) | 좌표 쌍, 너비 및 높이로 지정된 사각형을 그립니다. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle)(Pen, int, int, int, int) | 좌표 쌍, 너비 및 높이로 지정된 사각형을 그립니다. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles)(Pen, RectangleF[]) | 에 의해 지정된 일련의 사각형을 그립니다.RectangleF 구조. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles_1)(Pen, Rectangle[]) | 에 의해 지정된 일련의 사각형을 그립니다.Rectangle 구조. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_2)(string, Font, Brush, PointF) | 지정된 텍스트 문자열을 지정된 위치에 지정된Brush 및Font 객체. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_4)(string, Font, Brush, RectangleF) | 지정된 사각형에 지정된 텍스트 문자열을 지정된Brush 및Font 지정된 서식 속성을 사용하는 개체StringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring)(string, Font, Brush, float, float) | 지정된 텍스트 문자열을 지정된 위치에 지정된Brush 그리고Font 객체. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_3)(string, Font, Brush, PointF, StringFormat) | 지정된 텍스트 문자열을 지정된 위치에 지정된Brush and Font 지정된 서식 속성을 사용하는 개체StringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | 지정된 사각형에 지정된 텍스트 문자열을 지정된Brush 및Font 지정된 서식 속성을 사용하는 개체StringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_1)(string, Font, Brush, float, float, StringFormat) | 지정된 텍스트 문자열을 지정된 위치에 지정된Brush and Font 지정된 서식 속성을 사용하는 개체StringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer/)(GraphicsContainer) | 현재 그래픽 컨테이너를 닫고 이 컨테이너의 상태를 복원합니다.Graphics 에 대한 호출에 의해 저장된 상태로BeginContainer 방법. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위해 한 번에 하나씩 콜백 메서드 에 지정합니다. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | S에서 선택한 사각형의 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 지정된 레코드를 보냅니다.[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 한 번에 하나씩, 지정된 지점에 표시하기 위한 콜백 메소드로. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 평행 사변형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 직사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) 지정된 이미지 속성을 사용하여 지정된 지점에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 평행사변형으로 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 선택한 사각형의 레코드를[`Metafile`](../../system.drawing.imaging/metafile/) , 지정된 이미지 속성을 사용하여 지정된 사각형에 표시하기 위한 콜백 메서드에 한 번에 하나씩. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip)(Rectangle) | 이 클립 영역을 업데이트합니다.Graphics a로 지정된 영역을 제외하려면Rectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip_1)(Region) | 이 클립 영역을 업데이트합니다.Graphics a로 지정된 영역을 제외하려면Region . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve)(Brush, PointF[]) | 배열로 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다.PointF 구조. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_3)(Brush, Point[]) | 배열로 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다.Point 구조. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_1)(Brush, PointF[], FillMode) | 배열로 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다.PointF 지정된 채우기 모드를 사용하는 구조. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_4)(Brush, Point[], FillMode) | 배열로 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다.Point 지정된 채우기 모드를 사용하는 구조. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | 지정된 채우기 모드와 장력을 사용하여 PointF 구조체 배열 에 의해 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_5)(Brush, Point[], FillMode, float) | 배열로 정의된 닫힌 추기경 스플라인 곡선의 내부를 채웁니다.Point 지정된 채우기 모드를 사용하는 구조. |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse_1)(Brush, RectangleF) | RectangleF 구조로 지정된 경계 사각형으로 정의된 타원의 내부를 채웁니다. |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse)(Brush, float, float, float, float) | 좌표 쌍, 너비 및 높이로 지정된 경계 사각형으로 정의된 타원의 내부를 채웁니다. |
| [FillPath](../../system.drawing/graphics/fillpath/)(Brush, GraphicsPath) | GraphicsPath의 내부를 채웁니다. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_2)(Brush, Rectangle, float, float) | Rectangle 구조와 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 섹션의 내부를 채웁니다. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_1)(Brush, float, float, float, float, float, float) | 좌표 쌍, 너비, 높이 및 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 섹션의 내부를 채웁니다. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie)(Brush, int, int, int, int, int, int) | 좌표 쌍, 너비, 높이 및 두 개의 방사형 선으로 지정된 타원으로 정의된 파이 섹션의 내부를 채웁니다. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon)(Brush, PointF[]) | 지정된 점 배열로 정의된 다각형의 내부를 채웁니다.PointF 구조. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_2)(Brush, Point[]) | 지정된 점 배열로 정의된 다각형의 내부를 채웁니다.Point 구조. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_1)(Brush, PointF[], FillMode) | 지정된 채우기 모드를 사용하여 PointF 구조로 지정된 점 배열로 정의된 다각형의 내부를 채웁니다. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_3)(Brush, Point[], FillMode) | 지정된 점 배열로 정의된 다각형의 내부를 채웁니다.Point 지정된 채우기 모드를 사용하는 구조. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle_1)(Brush, RectangleF) | RectangleF 구조로 지정된 사각형의 내부를 채웁니다. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle)(Brush, float, float, float, float) | 좌표 쌍, 너비 및 높이로 지정된 사각형의 내부를 채웁니다. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles)(Brush, RectangleF[]) | 에 의해 지정된 일련의 사각형의 내부를 채웁니다.RectangleF 구조. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles_1)(Brush, Rectangle[]) | 에 의해 지정된 일련의 사각형의 내부를 채웁니다.Rectangle 구조. |
| [FillRegion](../../system.drawing/graphics/fillregion/)(Brush, Region) | Region. 의 내부를 채웁니다. |
| [Flush](../../system.drawing/graphics/flush/#flush)() | 보류 중인 모든 그래픽 작업을 강제로 실행하고 작업이 완료될 때까지 기다리지 않고 즉시 반환합니다. |
| [Flush](../../system.drawing/graphics/flush/#flush_1)(FlushIntention) | 작업이 완료되기 전에 반환되도록 지정된 대로 기다리거나 기다리지 않는 메서드를 사용하여 보류 중인 모든 그래픽 작업을 강제로 실행합니다. |
| [GetHdc](../../system.drawing/graphics/gethdc/)() | 이와 관련된 장치 컨텍스트에 대한 핸들을 가져옵니다.Graphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor/)(Color) | 지정된 색상에 가장 가까운 색상을 가져옵니다.Color 구조. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip)(Rectangle) | 이 클립 영역을 업데이트합니다.Graphics 현재 클립 영역과 지정된Rectangle 구조. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_1)(RectangleF) | 이 클립 영역을 업데이트합니다.Graphics 현재 클립 영역과 지정된RectangleF 구조. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_2)(Region) | 이 클립 영역을 업데이트합니다.Graphics 현재 클립 영역과 지정된Region . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_4)(Point) | 지정된Point 구조는 이 파일의 보이는 클립 영역 내에 포함됩니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_5)(PointF) | 지정된PointF 구조는 이 파일의 보이는 클립 영역 내에 포함됩니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_6)(Rectangle) | 에 의해 지정된 사각형이Rectangle 구조는 이 파일의 보이는 클립 영역 내에 포함됩니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_7)(RectangleF) | 에 의해 지정된 사각형이RectangleF 구조는 이 파일의 보이는 클립 영역 내에 포함됩니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_2)(float, float) | 한 쌍의 좌표로 지정된 점이 이 파일의 보이는 클립 영역 내에 포함되는지 여부를 나타냅니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible)(int, int) | 한 쌍의 좌표로 지정된 점이 이 파일의 보이는 클립 영역 내에 포함되는지 여부를 나타냅니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_3)(float, float, float, float) | 좌표 쌍, 너비 및 높이로 지정된 사각형이 이 클립의 보이는 클립 영역 내에 포함되는지 여부를 나타냅니다.Graphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_1)(int, int, int, int) | 좌표 쌍, 너비 및 높이로 지정된 사각형이 이 클립의 보이는 클립 영역 내에 포함되는지 여부를 나타냅니다.Graphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges/)(string, Font, RectangleF, StringFormat) | 배열을 가져옵니다.Region 각각 지정된 string. 내의 문자 위치 범위를 제한하는 객체 |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring)(string, Font) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_1)(string, Font, int) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_4)(string, Font, SizeF) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_2)(string, Font, int, StringFormat) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_3)(string, Font, PointF, StringFormat) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_5)(string, Font, SizeF, StringFormat) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | 지정된 문자열로 그릴 때 지정된 문자열을 측정합니다.Font 및 formatted 지정된StringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform)(Matrix) | 이것의 세계 변환을 곱합니다.Graphics 그리고 지정Matrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | 이것의 세계 변환을 곱합니다.Graphics 그리고 specified 는Matrix 지정된 order. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc)() | 에 대한 이전 호출에서 얻은 장치 컨텍스트 핸들을 해제합니다.GetHdc 이것의 방법Graphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc_1)(IntPtr) | 에 대한 이전 호출에서 얻은 장치 컨텍스트 핸들을 해제합니다.GetHdc 이것의 method Graphics . |
| [ResetClip](../../system.drawing/graphics/resetclip/)() | 이 클립 영역을 재설정합니다.Graphics 무한한 영역으로. |
| [ResetTransform](../../system.drawing/graphics/resettransform/)() | 이 세계 변환 매트릭스를 재설정합니다.Graphics 항등 행렬로. |
| [Restore](../../system.drawing/graphics/restore/)(GraphicsState) | 이 상태를 복원합니다.`Graphics` 로 표현되는 상태로[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform)(float) | 지정된 회전을 이 변환 행렬에 적용합니다.Graphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 지정된 회전을 이 변환 행렬에 적용합니다.Graphics 지정된 order. |
| [Save](../../system.drawing/graphics/save/)() | 현재 상태를 저장합니다.`Graphics` 저장된 상태를[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform)(float, float) | 지정된 스케일링 작업을 이 변환 행렬에 적용합니다.Graphics it 를 개체의 변환 행렬 앞에 추가합니다. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 지정된 스케일링 작업을 이 변환 행렬에 적용합니다.Graphics 지정된 order. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_2)(Graphics) | 이 클리핑 영역을 설정합니다.`Graphics` 지정된 클립 속성에`Graphics` |
| [SetClip](../../system.drawing/graphics/setclip/#setclip)(GraphicsPath) | 이 클리핑 영역을 설정합니다.`Graphics` 지정된[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_4)(Rectangle) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과[`Rectangle`](../rectangle/) 구조. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_6)(RectangleF) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과[`RectangleF`](../rectanglef/) 구조. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_3)(Graphics, CombineMode) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과 지정된 클립 영역의 지정된 결합 작업 결과로`Graphics` . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_1)(GraphicsPath, CombineMode) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과 지정된[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_5)(Rectangle, CombineMode) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과[`Rectangle`](../rectangle/) 구조. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_7)(RectangleF, CombineMode) | 이 클리핑 영역을 설정합니다.`Graphics` 현재 클립 영역과[`RectangleF`](../rectanglef/) 구조. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_8)(Region, CombineMode) | 이 클리핑 영역을 설정합니다.Graphics지정된 작업의 결과 결합 현재 클립 영역과 지정된Region . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | 현재 세계와 페이지 변환을 사용하여 한 좌표 공간에서 다른 좌표 공간으로 점 배열을 변환합니다.Graphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | 현재 세계와 페이지 변환을 사용하여 한 좌표 공간에서 다른 좌표 공간으로 점 배열을 변환합니다.Graphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip_1)(float, float) | 이 클리핑 영역을 변환합니다.Graphics 수평 및 수직 방향으로 지정된 양만큼. |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip)(int, int) | 이 클리핑 영역을 변환합니다.Graphics 수평 및 수직 방향으로 지정된 양만큼. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform)(float, float) | 지정된 translation 를 이 변환 매트릭스 앞에 추가하여 좌표계의 원점을 변경합니다.Graphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 이 변환 행렬 에 지정된 변환을 적용하여 좌표계의 원점을 변경합니다.Graphics 지정된 order. |

## 다른 멤버들

| 이름 | 설명 |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort/) | 언제 결정하기 위한 콜백 메서드를 제공합니다.[`DrawImage`](./drawimage/) 메서드는 실행을 조기에 취소하고 이미지 그리기를 중지해야 합니다. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc/) | 에 대한 콜백 메소드를 제공합니다.[`EnumerateMetafile`](./enumeratemetafile/) 방법. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


