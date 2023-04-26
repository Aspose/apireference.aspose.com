---
title: Aspose.Page.XPS.XpsMetadata
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.Xps.XpsMetadata名前空間はXPS ドキュメントのメタデータを記述するクラスを提供します
type: docs
weight: 110
url: /ja/net/aspose.page.xps.xpsmetadata/
---
**Aspose.Page.Xps.XpsMetadata**名前空間は、XPS ドキュメントのメタデータを記述するクラスを提供します。

## クラス

| クラス | 説明 |
| --- | --- |
| [Collate](./collate/) | の基本クラス[`DocumentCollate`](../aspose.page.xps.xpsmetadata/documentcollate/)と[`JobCollateAllDocuments`](../aspose.page.xps.xpsmetadata/jobcollatealldocuments/)機能クラス. |
| [CompositePrintTicketElement](./compositeprintticketelement/) | 複合印刷スキーマ要素 (つまり、他の要素を含む) である可能性があるクラスの基本クラス。 |
| [DecimalValue](./decimalvalue/) | PrintTicket ドキュメントで Decimal 値をカプセル化するクラス。 |
| [DocumentBannerSheet](./documentbannersheet/) | 特定のドキュメントに対して出力するバナーシートを記述します。バナーシートはdefault に出力する必要があります[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)デフォルトを使用して[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/).バナー シートは、 ジョブの残りの部分からも分離する必要があります。これは、仕上げまたは処理オプション ( など)[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) 、[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/) 、 また[`DocumentBinding`](../aspose.page.xps.xpsmetadata/documentbinding/)) にバナー シートを含めないでください。バナー シートは、ジョブの残りの部分から分離されている場合と分離されていない場合があります。 これは、ジョブの仕上げまたは処理オプションに、ドキュメント バナー シートが含まれる可能性があることを意味します。 バナー シートは、ドキュメントの最初のシートとして発生する必要があります。 https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet |
| [DocumentBannerSheetSource](./documentbannersheetsource/) | カスタム バナー シートのソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheetsource |
| [DocumentBinding](./documentbinding/) | バインド方法を記述します。各ドキュメントは個別にバインドされます. DocumentBinding と JobBindAllDocuments は相互に排他的です. キーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding |
| [DocumentBindingGutter](./documentbindinggutter/) | とじしろの幅を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbindinggutter |
| [DocumentCollate](./documentcollate/) | 出力の照合特性を記述します。個々のドキュメントのすべてのページが照合されます。 DocumentCollate と JobCollateAlldocuments は相互に排他的です。これらのキーワードの の両方または 1 つだけが実装されているかどうかの動作と実装は、ドライバーに任されています。 |
| [DocumentCopiesAllPages](./documentcopiesallpages/) | ドキュメントの部数を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcopiesallpages |
| [DocumentCoverBack](./documentcoverback/) | 裏（エンディング）表紙を記述します。各ドキュメントには個別のシートがあります。 カバー シートは、[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)と[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) はドキュメントの最終ページに使用されます。カバー シートは処理 options に統合する必要があります ([`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) 、[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback |
| [DocumentCoverBackSource](./documentcoverbacksource/) | カスタム裏表紙のソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverbacksource |
| [DocumentCoverFront](./documentcoverfront/) | 表紙（冒頭）の表紙を記述します。各ドキュメントには個別のシートがあります。 カバー シートは、[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)と[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/)ドキュメントの最初のページに使用される 。カバー シートは処理 options に統合する必要があります ([`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/) 、[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront |
| [DocumentCoverFrontSource](./documentcoverfrontsource/) | カスタム表紙のソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfrontsource |
| [DocumentDuplex](./documentduplex/) | 出力のデュプレックス特性を記述します。両面印刷機能により、メディアの両面に 印刷できます。各ドキュメントは別々に二重化されます. DocumentDuplex と JobDuplexAllDocumentsContiguously は相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex |
| [DocumentHolePunch](./documentholepunch/) | 出力の穴あけ特性を記述します。各ドキュメントは個別にパンチされます。 [`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/)と[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/)キーワードは相互に排他的です。 PrintTicket または Print Capabilities ドキュメントで両方を同時に指定しないでください。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch |
| [DocumentID](./documentid/) | ドキュメントの一意の ID を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentid |
| [DocumentImpositionColor](./documentimpositioncolor/) | 指定された名前付きの色でラベル付けされたアプリケーション コンテンツは、すべての色分解で表示する必要があります。 |
| [DocumentInputBin](./documentinputbin/) | デバイスにインストールされている入力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) 、[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) 、 と[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/) キーワードは相互に排他的です。 PrintTicket または印刷機能ドキュメントで両方を同時に指定しないでください。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin |
| [DocumentName](./documentname/) | ドキュメントのわかりやすい名前を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentname |
| [DocumentNUp](./documentnup/) | 複数の論理ページの出力とフォーマットを 1 つの物理シートに記述します。 各ドキュメントは個別にコンパイルされます。と[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) は相互に排他的です。これらのキーワード間の制約処理を決定するのは、ドライバー次第です。 |
| [DocumentOutputBin](./documentoutputbin/) | デバイスでサポートされているビンの完全なリストについて説明します。ドキュメントごとに output bin を指定できます。の[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) 、[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/)and [`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/)キーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つのみです。 |
| [DocumentPageRanges](./documentpageranges/) | 文書の出力範囲をページ単位で記述します。パラメータ値は次の構造に準拠する必要があります: - PageRangeText: "PageRange" または "PageRange,PageRange" - PageRange: "PageNumber" または "PageNumber-PageNumber" - PageNumber: 1 から N (N はページの数) If PageNumber &gt; N, then PageNumber = N. 文字列内の空白は無視する必要があります. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges |
| [DocumentPrintTicket](./documentprintticket/) | ドキュメント レベルの印刷チケットをカプセル化するクラス。 |
| [DocumentRollCut](./documentrollcut/) | ロール紙のカット方法について説明します。各ドキュメントは個別に処理されます。 指定されたオプションは、ロール カットのさまざまな方法を記述します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentrollcut |
| [DocumentSeparatorSheet](./documentseparatorsheet/) | ドキュメントのセパレータ シートの使用法について説明します。 セパレータ シートは、以下で指定されたオプションで示されるように、出力に表示される必要があります。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentseparatorsheet |
| [DocumentStaple](./documentstaple/) | 出力のステープル特性を記述します。各ドキュメントは個別にステープルされます。 [`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/)と[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/)キーワードは相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple |
| [DocumentURI](./documenturi/) | ドキュメントの Uniform Resource Identifier (URI) を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documenturi |
| [Duplex](./duplex/) | の基本クラス[`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/)と[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/)機能クラス. |
| [Feature](./feature/) | 共通の印刷スキーマ機能をカプセル化するクラス。 すべてのスキーマ定義機能の基本クラス。 A要素には、[`Option`](../aspose.page.xps.xpsmetadata/option/)と[`Property`](../aspose.page.xps.xpsmetadata/property/) デバイス属性、ジョブの書式設定、またはその他の関連する特性を完全に記述する要素。 |
| [HolePunch](./holepunch/) | の基本クラス[`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/)と[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/)機能クラス. |
| [IDProperty](./idproperty/) | の基本クラス[`JobID`](../aspose.page.xps.xpsmetadata/jobid/)と[`DocumentID`](../aspose.page.xps.xpsmetadata/documentid/)プロパティ classes. |
| [InputBin](./inputbin/) | の基本クラス[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) 、[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/) と[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/)機能クラス. |
| [IntegerParameterInit](./integerparameterinit/) | すべての整数パラメーター初期化子の基本クラス。 |
| [IntegerValue](./integervalue/) | PrintTicket ドキュメントで整数値をカプセル化するクラス。 |
| [JobAccountingSheet](./jobaccountingsheet/) | ジョブで出力する帳票を記述します。 default に会計帳票が出力されているはずです。[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)デフォルトを使用して[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) .アカウンティング シートは、ジョブの残りの部分から 分離する必要があります。これは、仕上げまたは処理オプション ( など) 、 、 また ) アカウンティング シートを含めないでください。 アカウンティング シートは、実装者の裁量でジョブの最初または最後のページとして表示される場合があります。 |
| [JobBindAllDocuments](./jobbindalldocuments/) | バインド方法を記述します。ジョブ内のすべての文書が製本されます. [`JobBindAllDocuments`](../aspose.page.xps.xpsmetadata/jobbindalldocuments/)と[`DocumentBinding`](../aspose.page.xps.xpsmetadata/documentbinding/)相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocuments |
| [JobBindAllDocumentsGutter](./jobbindalldocumentsgutter/) | とじしろの幅を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocumentsgutter |
| [JobCollateAllDocuments](./jobcollatealldocuments/) | 出力の照合特性を記述します。個々のジョブのすべてのドキュメントが照合されます。 [`DocumentCollate`](../aspose.page.xps.xpsmetadata/documentcollate/)と[`JobCollateAllDocuments`](../aspose.page.xps.xpsmetadata/jobcollatealldocuments/)相互に排他的です. これらのキーワードの両方が実装されているか、1 つだけが実装されているかの動作と実装は、ドライバーに任されています. |
| [JobComment](./jobcomment/) | ジョブに関連付けられたコメントを指定します。例：「完成したら1234号室に届けてください」. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcomment |
| [JobCopiesAllDocuments](./jobcopiesalldocuments/) | ジョブの部数を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcopiesalldocuments |
| [JobDeviceLanguage](./jobdevicelanguage/) | ドライバーから物理デバイスにデータを送信するためにサポートされているデバイス言語について説明します。 これは「ページ記述言語」と呼ばれることがよくあります。このキーワードは、ドライバーと物理デバイスでサポートされているページ記述 言語を定義します。 |
| [JobDigitalSignatureProcessing](./jobdigitalsignatureprocessing/) | ジョブ全体のデジタル署名処理の構成について説明します。 デジタル署名を含むコンテンツにのみ適用されます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobdigitalsignatureprocessing |
| [JobDuplexAllDocumentsContiguously](./jobduplexalldocumentscontiguously/) | 出力のデュプレックス特性を記述します。両面印刷機能により、メディアの両面に on 印刷できます。ジョブ内のすべてのドキュメントが連続して両面印刷されます. [`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/)と[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/)相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobduplexalldocumentscontiguously |
| [JobErrorSheet](./joberrorsheet/) | エラーシート出力について説明します。ジョブ全体で 1 つのエラー シートが作成されます。エラー sheet はデフォルトで出力されるはずです[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)デフォルトを使用して[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/). エラー シートは、ジョブの残りの部分から分離する必要があります。これは、すべての仕上げ or 処理オプション ( 、 、 また) にエラー シートを含めないでください。エラー シートは、ジョブの最終シートとして表示されます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet |
| [JobErrorSheetSource](./joberrorsheetsource/) | カスタム エラー シートのソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheetsource |
| [JobHolePunch](./jobholepunch/) | 出力の穴あけ特性を記述します。すべてのドキュメントが一緒にパンチされます. [`JobHolePunch`](../aspose.page.xps.xpsmetadata/jobholepunch/)と[`DocumentHolePunch`](../aspose.page.xps.xpsmetadata/documentholepunch/)キーワードは相互に排他的です. PrintTicket または Print Capabilities ドキュメントで両方を同時に指定しないでください. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch |
| [JobID](./jobid/) | ジョブの一意の ID を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobid |
| [JobInputBin](./jobinputbin/) | デバイスにインストールされている入力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。 ジョブごとに入力ビンを指定できます。の[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) 、[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/), と[`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/)キーワードは相互に排他的です。 PrintTicket または Print Capabilities ドキュメントで両方を同時に指定することはできません 。 |
| [JobName](./jobname/) | ジョブのわかりやすい名前を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobname |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/) | 1 つの物理シートへの複数の論理ページの出力について説明します。 job 内のすべてのドキュメントは、連続して一緒にコンパイルされます。[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/)と[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) は相互に排他的です。これらのキーワード間の制約の処理を決定するのは、ドライバー次第です。 |
| [JobOptimalDestinationColorProfile](./joboptimaldestinationcolorprofile/) | 現在のデバイス構成で最適なカラー プロファイルを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joboptimaldestinationcolorprofile |
| [JobOutputBin](./joboutputbin/) | デバイスにインストールされている出力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) 、[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/)と[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/)キーワード は相互に排他的で、PrintTicket または印刷機能ドキュメントで指定する必要があるのは 1 つのみです。 |
| [JobOutputOptimization](./joboutputoptimization/) | 指定されたオプションで示されるように、特定の使用シナリオに合わせて出力を最適化することを目的とした、ジョブ処理について説明します。 |
| [JobPageOrder](./jobpageorder/) | 出力の物理ページの順序を定義します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobpageorder |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/) | ジョブで出力するバナーシートを記述します。バナーシートはdefault に出力する必要があります[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)デフォルトを使用して[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/).バナー シートは、残りのジョブから分離する必要があります。これは、仕上げまたは処理オプション ( など)[`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) 、[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/) 、 また[`JobBindAllDocuments`](../aspose.page.xps.xpsmetadata/jobbindalldocuments/) ) にバナー シートを含めないでください。バナー シートは、ジョブの最初のシートとして発生する必要があります。 |
| [JobPrimaryBannerSheetSource](./jobprimarybannersheetsource/) | ジョブのプライマリ カスタム バナー シートのソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarybannersheetsource |
| [JobPrimaryCoverBack](./jobprimarycoverback/) | 裏（エンディング）表紙を記述します。各ジョブには個別のプライマリ シートがあります。 カバー シートは、[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)と[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) は、ジョブの最終ページに使用されます。カバー シートは処理 options に統合する必要があります ([`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) 、[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback |
| [JobPrimaryCoverBackSource](./jobprimarycoverbacksource/) | ジョブのカスタム裏表紙プライマリ シートのソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverbacksource |
| [JobPrimaryCoverFront](./jobprimarycoverfront/) | 表紙（冒頭）の表紙を記述します。ジョブ全体でプライマリ シートが 1 枚になります。 カバー シートは、[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)と[`PageMediaType`](../aspose.page.xps.xpsmetadata/pagemediatype/) は、ジョブの最初のページに使用されます。カバー シートは処理 options に統合する必要があります ([`JobDuplexAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobduplexalldocumentscontiguously/) 、[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverfront |
| [JobPrimaryCoverFrontSource](./jobprimarycoverfrontsource/) | ジョブのカスタム表紙プライマリ シートのソースを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverfrontsource |
| [JobPrintTicket](./jobprintticket/) | ジョブ レベルの印刷チケットをカプセル化するクラス。 |
| [JobRollCutAtEndOfJob](./jobrollcutatendofjob/) | ロール紙のカット方法について説明します。ジョブの最後にロールをカットする必要があります。 |
| [JobStapleAllDocuments](./jobstaplealldocuments/) | 出力のステープル特性を記述します。ジョブ内のすべての文書がステープル留めされます。 [`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/)と[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/)キーワードは相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobstaplealldocuments |
| [JobURI](./joburi/) | ドキュメントの Uniform Resource Identifier (URI) を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joburi |
| [NameProperty](./nameproperty/) | の基本クラス[`JobName`](../aspose.page.xps.xpsmetadata/jobname/)と[`DocumentName`](../aspose.page.xps.xpsmetadata/documentname/)プロパティ classes. |
| [NUp](./nup/) | の基本クラス[`JobNUpAllDocumentsContiguously`](../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/)と[`DocumentNUp`](../aspose.page.xps.xpsmetadata/documentnup/) 機能クラス. |
| [Option](./option/) | 共通の PrintTicket を実装するクラス. すべてのスキーマ定義オプションの基本クラス. Option 要素には、すべての[`Property`](../aspose.page.xps.xpsmetadata/property/)and [`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/)このオプションに関連付けられている要素. https://docs.microsoft.com/en-us/windows/win32/printdocs/option |
| [OutputBin](./outputbin/) | の基本クラス[`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) 、[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/)と[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/) 機能クラス. |
| [PageBlackGenerationProcessing](./pageblackgenerationprocessing/) | CMYK 分版の黒の生成動作を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessing |
| [PageBlackGenerationProcessingBlackInkLimit](./pageblackgenerationprocessingblackinklimit/) | 指定された名前付きの色でラベル付けされたアプリケーション コンテンツは、すべての色分解で表示する必要があります。 |
| [PageBlackGenerationProcessingGrayComponentReplacementExtent](./pageblackgenerationprocessinggraycomponentreplacementextent/) | GCR が適用する (有彩色への) ニュートラルを超えた範囲について説明します。 0% = 均一なコンポーネントの置き換え、100% = グレー コンポーネントの置き換え。 https://docs.microsoft.com/en-us/windows/win32/printdocs /pageblackgenerationprocessinggreycomponentreplacementextent |
| [PageBlackGenerationProcessingGrayComponentReplacementLevel](./pageblackgenerationprocessinggraycomponentreplacementlevel/) | 実行するグレー コンポーネント置換の割合を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblackgenerationprocessinggraycomponentreplacementlevel |
| [PageBlackGenerationProcessingGrayComponentReplacementStart](./pageblackgenerationprocessinggraycomponentreplacementstart/) | GCR が開始する "ハイライトからシャドウ" の範囲内のポイントを記述します (100% の最も暗いシャドウ)。 |
| [PageBlackGenerationProcessingTotalInkCoverageLimit](./pageblackgenerationprocessingtotalinkcoveragelimit/) | 画像内の任意の場所にある 4 つのインク適用範囲の最大許容合計を指定します。 |
| [PageBlackGenerationProcessingUnderColorAdditionLevel](./pageblackgenerationprocessingundercoloradditionlevel/) | GCR/UCR が生成した領域に追加する有彩色インクの量 (グレー コンポーネントの比率) を記述します "BlackInkLimit" (または、指定されている場合は UCAStart) をダーク ニュートラルおよびニュートラルに近い領域で指定します。 https://docs.microsoft .com/en-us/windows/win32/printdocs/pageblackgenerationprocessingundercoloradditionlevel |
| [PageBlackGenerationProcessingUnderColorAdditionStart](./pageblackgenerationprocessingundercoloradditionstart/) | UCA が適用されるシャドー レベルを記述します。 |
| [PageBlendColorSpace](./pageblendcolorspace/) | ブレンド操作に使用する色空間について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageblendcolorspace |
| [PageBlendColorSpaceICCProfileURI](./pageblendcolorspaceiccprofileuri/) | ブレンディングに使用する必要がある色空間を定義する ICC プロファイルへの相対 URI 参照を指定します。 &lt;Uri&gt; は、パッケージ ルートに対する絶対 part_name です。 /windows/win32/printdocs/pageblendcolorspaceiccprofileuri |
| [PageBorderless](./pageborderless/) | イメージ コンテンツをメディアの物理的な端まで印刷する必要がある場合について説明します。 |
| [PageColorManagement](./pagecolormanagement/) | 現在のページのカラー管理を構成します。 これは SHIM で自動と見なされます - DM_ICMMethod Add System. カラー管理を実行する必要があるコンポーネント (つまり、ドライバー) を説明します。 /win32/printdocs/pagecolormanagement |
| [PageCopies](./pagecopies/) | ページの部数を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagecopies |
| [PageDestinationColorProfile](./pagedestinationcolorprofile/) | 宛先カラー プロファイルの特性を定義します。 アプリケーションまたはドライバーが使用する宛先カラー プロファイルを選択するかどうかを記述します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofile |
| [PageDestinationColorProfileEmbedded](./pagedestinationcolorprofileembedded/) | 埋め込み先のカラー プロファイルを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileembedded |
| [PageDestinationColorProfileURI](./pagedestinationcolorprofileuri/) | XPS ドキュメントに含まれる ICC プロファイルへの相対 URI 参照を指定します。 このオプションの処理は、PageDeviceColorSpaceUsage 機能の設定によって異なります。 そのプロファイルを使用するすべての要素は、適切なデバイスの色空間に既にあると想定されます, ドライバーまたはデバイスで色が管理されません. |
| [PageDeviceColorSpaceProfileURI](./pagedevicecolorspaceprofileuri/) | XPS ドキュメントに含まれる ICC プロファイルへのパッケージ ルートへの相対 URI を指定します。 このオプションの処理は、PageDeviceColorSpaceUsage 機能の設定によって異なります。 そのプロファイルを使用するすべての要素は、既に適切なデバイス カラーであると見なされます。スペース, であり、ドライバーまたはデバイスで色が管理されません. |
| [PageDeviceColorSpaceUsage](./pagedevicecolorspaceusage/) | と組み合わせて[`PageDeviceColorSpaceProfileURI`](../aspose.page.xps.xpsmetadata/pagedevicecolorspaceprofileuri/)このパラメーターは、 デバイスの色空間で表示される要素のレンダリング動作を定義します。 |
| [PageDeviceFontSubstitution](./pagedevicefontsubstitution/) | デバイス フォント置換の有効/無効状態について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedevicefontsubstitution |
| [PageForceFrontSide](./pageforcefrontside/) | 出力を強制的にメディア シートの前面に表示します。両面に異なる 面を持つメディア シートに関連します。この機能が処理オプション ( など) に干渉する場合[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/))、機能が適用される特定の ページが優先されます. |
| [PageICMRenderingIntent](./pageicmrenderingintent/) | ICC v2 仕様で定義されているレンダリング インテントを記述します。 イメージまたはグラフィック要素に、レンダリング インテントを指定するプロファイル が埋め込まれている場合、この値は無視する必要があります。 https://docs.microsoft.com/en-us/ Windows/win32/printdocs/pageicmrenderingintent |
| [PageImageableSize](./pageimageablesize/) | レイアウトとレンダリング用にイメージ化されたキャンバスを記述します。これは on に基づいて報告されます[`PageMediaSize`](../aspose.page.xps.xpsmetadata/pagemediasize/)と[`PageOrientation`](../aspose.page.xps.xpsmetadata/pageorientation/). https://docs.microsoft.com/en-us/windows/win32/printdocs/pageimageablesize |
| [PageInputBin](./pageinputbin/) | デバイスにインストールされている入力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。 ページごとに入力ビンを指定できます。の[`JobInputBin`](../aspose.page.xps.xpsmetadata/jobinputbin/) 、[`DocumentInputBin`](../aspose.page.xps.xpsmetadata/documentinputbin/)and [`PageInputBin`](../aspose.page.xps.xpsmetadata/pageinputbin/)キーワードは相互に排他的です。 PrintTicket または Print Capabilities ドキュメントで両方を同時に指定することはできません 。 |
| [PageMediaColor](./pagemediacolor/) | メディア カラー オプションと各オプションの特性について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediacolor |
| [PageMediaSize](./pagemediasize/) | 出力に使用される物理メディアの寸法について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasize |
| [PageMediaSizeMediaSizeHeight](./pagemediasizemediasizeheight/) | 次元を指定しますカスタムの方向性option. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizemediasizeheight |
| [PageMediaSizeMediaSizeWidth](./pagemediasizemediasizewidth/) | 次元を指定しますカスタムの方向性 option. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizemediasizewidth |
| [PageMediaSizePSHeight](./pagemediasizepsheight/) | 送り方向に平行なページの高さを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepsheight |
| [PageMediaSizePSHeightOffset](./pagemediasizepsheightoffset/) | 送り方向に平行なオフセットを指定します。 |
| [PageMediaSizePSOrientation](./pagemediasizepsorientation/) | フィードの方向に対する方向を指定します https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepsorientation |
| [PageMediaSizePSWidth](./pagemediasizepswidth/) | 送り方向に垂直なページの幅を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepswidth |
| [PageMediaSizePSWidthOffset](./pagemediasizepswidthoffset/) | 送り方向に垂直なオフセットを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediasizepswidthoffset |
| [PageMediaType](./pagemediatype/) | は、オプションと各オプションの特徴. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemediatype |
| [PageMirrorImage](./pagemirrorimage/) | 出力のミラーリング設定について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagemirrorimage |
| [PageNegativeImage](./pagenegativeimage/) | 出力の負の設定について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagenegativeimage |
| [PageOrientation](./pageorientation/) | 物理メディア シートの向きを記述します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageorientation |
| [PageOutputBin](./pageoutputbin/) | デバイスでサポートされているビンの完全なリストについて説明します。ページ単位で出力ビンを指定できます。 [`JobOutputBin`](../aspose.page.xps.xpsmetadata/joboutputbin/) 、[`DocumentOutputBin`](../aspose.page.xps.xpsmetadata/documentoutputbin/)と[`PageOutputBin`](../aspose.page.xps.xpsmetadata/pageoutputbin/)キーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つだけです. |
| [PageOutputColor](./pageoutputcolor/) | 出力の色設定の特性について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputcolor |
| [PageOutputQuality](./pageoutputquality/) | 出力の負の設定について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputquality |
| [PagePhotoPrintingIntent](./pagephotoprintingintent/) | 写真の印刷設定を取り込むためのドライバーに対する高レベルの意図を示します。 これらの設定は、ユーザーが写真を印刷するときに指定する可能性のある予想される出力品質を扱います。 https://docs.microsoft.com/en-us/windows /win32/printdocs/pagephotoprintingintent |
| [PagePoster](./pageposter/) | 複数の物理メディア シートへの単一ページの出力について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter |
| [PagePrintTicket](./pageprintticket/) | ページ レベルの印刷チケットをカプセル化するクラス。 |
| [PageResolution](./pageresolution/) | 印刷出力のページ解像度を定性値または 1 インチあたりのドット数、またはその両方として定義します。 |
| [PageScaling](./pagescaling/) | 出力のスケーリング特性について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescaling |
| [PageScalingOffsetHeight](./pagescalingoffsetheight/) | のスケーリング オフセットを指定します。カスタム スケーリングの方向。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingoffsetheight |
| [PageScalingOffsetWidth](./pagescalingoffsetwidth/) | のスケーリング オフセットを指定します。カスタム スケーリングの方向。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingoffsetwidth |
| [PageScalingScale](./pagescalingscale/) | カスタム平方スケーリングの倍率を指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscale |
| [PageScalingScaleHeight](./pagescalingscaleheight/) | の倍率を指定します。カスタム スケーリングの方向。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscaleheight |
| [PageScalingScaleWidth](./pagescalingscalewidth/) | の倍率を指定します。カスタム スケーリングの方向。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescalingscalewidth |
| [PageSourceColorProfile](./pagesourcecolorprofile/) | ソース カラー プロファイルの特性を定義します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagesourcecolorprofile |
| [PageSourceColorProfileEmbedded](./pagesourcecolorprofileembedded/) | 埋め込まれたソース カラー プロファイルを指定します。 |
| [PageSourceColorProfileURI](./pagesourcecolorprofileuri/) | カラー プロファイルのソースを指定します。 |
| [PageTrueTypeFontMode](./pagetruetypefontmode/) | 使用する TrueType フォントの処理方法について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagetruetypefontmode |
| [PageWatermark](./pagewatermark/) | 出力の透かし設定と透かし特性を記述します。透かしは、物理ページではなく、論理ページに を適用します。たとえば、[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/)有効にすると、 透かしがそれぞれに表示されます各シートのページ。もしも[`DocumentDuplex`](../aspose.page.xps.xpsmetadata/documentduplex/), =2 の場合、各シートには 2 つの透かしがあります。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark |
| [PageWatermarkOriginHeight](./pagewatermarkoriginheight/) | 透かしの原点を基準にして、透かしの原点を指定します。. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarkoriginheight |
| [PageWatermarkOriginWidth](./pagewatermarkoriginwidth/) | 透かしの原点を基準にして、透かしの原点を指定します。 . https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarkoriginwidth |
| [PageWatermarkTextAngle](./pagewatermarktextangle/) | に対する透かしテキストの角度を指定します。 direction. 角度は反時計回りで測定されます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextangle |
| [PageWatermarkTextColor](./pagewatermarktextcolor/) | 透かしテキストの sRGB カラーを定義します。フォーマットは ARGB です: #AARRGGBB. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextcolor |
| [PageWatermarkTextFontSize](./pagewatermarktextfontsize/) | 透かしテキストに使用できるフォント サイズを定義します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktextfontsize |
| [PageWatermarkTextText](./pagewatermarktexttext/) | 透かしのテキストを指定します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktexttext |
| [PageWatermarkTransparency](./pagewatermarktransparency/) | 透かしの透明度を指定します。完全に不透明な場合、値は 0. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermarktransparency になります。 |
| [ParameterInit](./parameterinit/) | 共通の PrintTicket パラメータ初期化子を実装するクラス。 すべてのスキーマ定義パラメータ初期化子の基本クラス。 のインスタンスの値を定義します。element. A要素は、によって作成された参照のターゲットです[`ParameterRef`](../aspose.page.xps.xpsmetadata/parameterref/)element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterinit |
| [ParameterRef](./parameterref/) | 共通の PrintTicket パラメータ参照を実装するクラス。 A要素はへの参照を定義します[`ParameterInit`](../aspose.page.xps.xpsmetadata/parameterinit/)element. A[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/)ParameterRef 要素を含む要素には、明示的に設定された がありません[`Value`](../aspose.page.xps.xpsmetadata/value/)エレメント。代わりに、[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) element はその値を[`ParameterInit`](../aspose.page.xps.xpsmetadata/parameterinit/)によって参照される要素element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref |
| [PrintTicket](./printticket/) | 任意のスコープの共通の PrintTicket を実装するクラス。 ジョブ、ドキュメント、およびページ レベルの印刷チケットの基本クラス。 Aelement は、PrintTicket ドキュメントのルート要素です。 A要素には、ジョブを出力するために必要なすべてのジョブ フォーマット情報が含まれています。 |
| [PrintTicketElement](./printticketelement/) | 印刷スキーマ要素である可能性があるクラスの基本クラス。 |
| [Property](./property/) | 共通の PrintTicket を実装するクラス . すべてのスキーマ定義プロパティの基本クラス。 A要素は、名前が name 属性によって与えられるデバイス、ジョブのフォーマット、またはその他の関連する property を宣言します。あ[`Value`](../aspose.page.xps.xpsmetadata/value/)要素は、 に値を割り当てるために使用されます. A複雑で、複数のサブプロパティを含む可能性があります。 サブプロパティは、 elements. https://docs.microsoft.com/en-us/windows/win32/printdocs/property |
| [QNameValue](./qnamevalue/) | PrintTicket ドキュメントの QName 値をカプセル化するクラス。 |
| [RollCut](./rollcut/) | の基本クラス[`JobRollCutAtEndOfJob`](../aspose.page.xps.xpsmetadata/jobrollcutatendofjob/)と[`DocumentRollCut`](../aspose.page.xps.xpsmetadata/documentrollcut/)機能クラス. |
| [ScoredProperty](./scoredproperty/) | 共通の PrintTicket を実装するクラス. すべてのスキーマ定義のスコア付きプロパティの基本クラス。 A要素は、an に固有のプロパティを宣言します[`Option`](../aspose.page.xps.xpsmetadata/option/)意味。このようなプロパティは、要求されたデータがどれだけ近いかを 評価するときに比較する必要があります。[`Option`](../aspose.page.xps.xpsmetadata/option/)サポートされているデバイスに一致します[`Option`](../aspose.page.xps.xpsmetadata/option/). https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty |
| [SelectionType](./selectiontype/) | SelectionType PrintTicket プロパティの簡易クラス。 |
| [Staple](./staple/) | の基本クラス[`JobStapleAllDocuments`](../aspose.page.xps.xpsmetadata/jobstaplealldocuments/)と[`DocumentStaple`](../aspose.page.xps.xpsmetadata/documentstaple/)機能クラス. |
| [StringParameterInit](./stringparameterinit/) | すべての文字列パラメータ初期化子の基本クラス。 |
| [StringValue](./stringvalue/) | PrintTicket ドキュメント内の文字列値をカプセル化するクラス。 |
| [URIProperty](./uriproperty/) | の基本クラス[`JobURI`](../aspose.page.xps.xpsmetadata/joburi/)と[`DocumentURI`](../aspose.page.xps.xpsmetadata/documenturi/)プロパティ classes. |
| [Value](./value/) | をカプセル化する基本クラス[`Property`](../aspose.page.xps.xpsmetadata/property/)または[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/) PrintTicket ドキュメントの値。 Value 要素は、リテラルを型に関連付けます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/value |
## インターフェース

| インターフェース | 説明 |
| --- | --- |
| [IDocumentPrintTicketItem](./idocumentprintticketitem/) | ドキュメント接頭辞付き印刷チケット項目のインターフェース。 |
| [IFeatureItem](./ifeatureitem/) | Print Schema の可能性があるクラスの基本インターフェイス[`Feature`](../aspose.page.xps.xpsmetadata/feature/)items. |
| [IJobPrintTicketItem](./ijobprintticketitem/) | ジョブ接頭辞付き印刷チケット項目のインターフェース。 |
| [IOptionItem](./ioptionitem/) | Print Schema の可能性があるクラスのインターフェース[`Option`](../aspose.page.xps.xpsmetadata/option/)items. |
| [IPagePrintTicketItem](./ipageprintticketitem/) | ページプレフィックス印刷チケット項目のインターフェイス。 |
| [IPrintTicketElementChild](./iprintticketelementchild/) | 任意の印刷スキーマ要素の子要素の基本インターフェイス。 |
| [IPrintTicketItem](./iprintticketitem/) | 可能性のあるクラスの基本インターフェイス。[`PrintTicket`](../aspose.page.xps.xpsmetadata/printticket/)ルート要素 items. スコープ プレフィックスを定義するインターフェイスの基本インターフェイスでもあります。 |
| [IPropertyItem](./ipropertyitem/) | PrintTicket の可能性があるクラスの基本インターフェイス[`Property`](../aspose.page.xps.xpsmetadata/property/)items. |
| [IScoredPropertyItem](./iscoredpropertyitem/) | PrintTicket の可能性があるクラスの基本インターフェイス[`ScoredProperty`](../aspose.page.xps.xpsmetadata/scoredproperty/)items. |


