---
title: "Aspose::Page::EPS::Device::PdfDevice 클래스"
linktitle: "PdfDevice"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::Device::PdfDevice 클래스. 이 클래스는 C++에서 문서를 PDF로 렌더링하는 기능을 캡슐화합니다."
type: docs
weight: 300
url: /ko/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


이 클래스는 문서를 PDF로 렌더링하는 기능을 캡슐화합니다.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [AUTHOR](./author/)() | \"Author\" 속성 값. |
| static [BACKGROUND](./background/)() | \"Background\" 속성 키. |
| static [BACKGROUND_COLOR](./background_color/)() | \"Background color\" 속성 키. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 주어진 모양을 사용하여 클립합니다. writeClip(Rectangle), writeClip(RectangleF) 또는 writeClip(Shape) 로 디스패치합니다. |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | 사각형을 클립합니다. clip(Rectangle2D)를 호출합니다. |
| [ClosePage](./closepage/)() override | 페이지가 렌더링된 후 장치에 필요한 준비를 수행합니다. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | \"Compress\" 속성 키. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | 이 장치의 복사본을 생성합니다. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | 그래픽 컨텍스트를 해제합니다. 생성 시 restoreOnDispose가 true였다면 writeGraphicsRestore()가 호출됩니다. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 경로를 그립니다. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | 지정된 변환 및 배경을 사용하여 이미지를 그립니다. |
| [DrawString](./drawstring/)(System::String, double, double) override | 주어진 지점에 문자열을 그립니다. |
| static [EMBED_FONTS](./embed_fonts/)() | \"Embed font in document\" 속성 키. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | \"What font type is used for embedding\" 속성 키. |
| static [EMIT_ERRORS](./emit_errors/)() | \"Emit errors\" 속성 값. |
| static [EMIT_WARNINGS](./emit_warnings/)() | \"Emit warnings\" 속성 값. |
| [EndDocument](./enddocument/)() override | 문서가 렌더링된 후 장치에 필요한 준비를 수행합니다. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 경로를 채웁니다. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | \"Fit content to page\" 속성 키. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | 현재 페이지 번호. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | 문자열 주위에 프레임과 배너를 그립니다. 이 메서드는 문자열을 그리기 전에 텍스트 커서를 설정해야 할 위치를 계산하여 반환합니다. |
| [get_OutputStream](./get_outputstream/)() override | 출력 스트림을 지정하거나 반환합니다. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | 현재 변환을 가져옵니다. |
| [InitClip](./initclip/)() override | 디바이스의 클립을 초기화합니다. |
| [InitPageNumbers](./initpagenumbers/)() override | 출력할 페이지 수를 초기화합니다. |
| static [KEYWORDS](./keywords/)() | "Keywords" 속성 값. |
| [OpenPage](./openpage/)(System::String) override | 페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다. |
| [OpenPage](./openpage/)(float, float) override | 각 페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다. |
| static [ORIENTATION](./orientation/)() | "Orientation" 속성 키. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" 속성 키. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" 속성 키. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | 출력 스트림으로 [PdfDevice](./)의 새 인스턴스를 초기화합니다. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | 출력 스트림과 지정된 페이지 크기로 [PdfDevice](./)의 새 인스턴스를 초기화합니다. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | 복제 생성자. 기존 디바이스로 [PdfDevice](./)의 새 인스턴스를 초기화합니다. |
| [ReNew](./renew/)() override | 전체 문서에 대해 디바이스를 초기 상태로 재설정합니다. 출력 스트림을 재설정하는 데 사용됩니다. |
| [ReNewForMerge](./renewformerge/)(bool) override | 여러 문서를 병합하는 동안 전체 문서에 대해 디바이스를 초기 상태로 재설정합니다. 출력 스트림을 재설정하는 데 사용됩니다. |
| [Reset](./reset/)() override | 페이지 디바이스 매개변수가 설정될 경우, 이 메서드는 쓰기 스트림을 페이지 시작으로 되돌릴 수 있게 합니다. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | 현재 변환을 Z축을 중심으로 회전합니다. writeTransform(Transform)를 호출합니다. 양의 각도 θ로 회전하면 양의 x축상의 점이 양의 y축 방향으로 회전합니다. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | 현재 변환 행렬을 스케일링합니다. writeTransform(Transform)를 호출합니다. |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | 현재 글꼴을 지정합니다. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | 출력 스트림을 지정하거나 반환합니다. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | 현재 페인트를 반환하거나 지정합니다. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | 현재 스트로크를 반환하거나 지정합니다. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | 디바이스의 클립을 지정합니다. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 현재 변환을 지정합니다. 대부분의 출력 형식이 이 기능을 구현하지 않기 때문에, currentTransform의 역변환을 계산하고 설정될 변환과 곱합니다. 결과는 writeTransform(Transform) 호출을 통해 전달됩니다. |
| [Shear](./shear/)(double, double) override | 현재 변환 행렬을 전단합니다. writeTransform(Transform)를 호출합니다. |
| [StartDocument](./startdocument/)() override | 문서 렌더링 시작 전에 디바이스에 필요한 준비를 수행합니다. |
| static [SUBJECT](./subject/)() | "Subject" 속성 값. |
| static [TITLE](./title/)() | "Title" 속성 값. |
| [ToString](./tostring/)() const override | 디바이스 유형의 이름을 반환합니다. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | 현재 변환 행렬을 변환합니다. writeTransform(Transform)를 호출합니다. |
| [Translate](./translate/)(double, double) override | 현재 변환 행렬을 평행 이동합니다. writeTransform(Transform)를 호출합니다. |
| static [TRANSPARENT](./transparent/)() | "Transparent" 속성 키. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | 다른 다중 페이지 디바이스에서 페이지 매개변수를 업데이트합니다. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" 속성 키. |
| [WriteBackground](./writebackground/)() override | 현재 배경을 기록합니다. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | 스트로크의 캡을 기록합니다. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | 주석을 기록합니다. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | 스트로크의 대시를 기록합니다. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | 카탈로그, docinfo, preferences, 그리고 (단일 페이지 출력만 사용하므로 페이지 트리)를 기록합니다. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | 스트로크의 조인을 기록합니다. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | 마지막으로 기록된 페인트를 기록합니다. 페인트를 기록한 후 그래픽 복원("Q")이 수행된 경우에 유용합니다. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | 스트로크의 마이터 제한을 기록합니다. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | 주어진 색상으로 페인트를 기록합니다. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | 주어진 그라디언트로 페인트를 기록합니다. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | 주어진 텍스처로 페인트를 기록합니다. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | 페인트를 기록합니다. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | 지정된 폰트로 문자열을 기록합니다. |
| [WriteTrailer](./writetrailer/)() | PDF 문서의 트레일러를 기록합니다. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 주어진 변환 행렬을 파일에 기록합니다. |
| [WriteWarning](./writewarning/)(System::String) override | 경고를 기록합니다. 기본적으로 System.err에 출력됩니다. |
| [WriteWidth](./writewidth/)(float) override | 스트로크의 너비를 기록합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [VERSION](./version/) | "Version" 속성 키. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" 속성 값. |

## Deprecated
PdfDevice 클래스는 24.3부터 사용 중단되었습니다. 대신 PsDocument 클래스의 SaveAsPdf 메서드를 사용하십시오. 24.6에서는 이 클래스가 완전히 숨겨질 예정입니다.

## 또 보기

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
