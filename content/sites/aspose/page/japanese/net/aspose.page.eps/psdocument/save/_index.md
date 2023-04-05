---
title: PsDocument.Save
second_title: Aspose.Page for .NET API リファレンス
description: PsDocument 方法. PS/EPS ファイルをデバイスに保存します
type: docs
weight: 200
url: /ja/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

PS/EPS ファイルをデバイスに保存します。

```csharp
public override void Save(Device device, SaveOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | Device | 出力デバイス。 |
| options | SaveOptions | 変換中にスローされたエラーの出力を指定するフラグが含まれています。 |

### 関連項目

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* 名前空間 [Aspose.Page.EPS](../../psdocument/)
* 組み立て [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

保存数[`PsDocument`](../)EPSファイルとして。このメソッドは、XMP メタデータを更新した後にのみ使用されます。 GetMetadata メソッドの呼び出し中に作成された更新済みの既存のメタデータまたは新しいメタデータを含む最初の EPS ファイルを保存します。 最後のケースでは、必要なすべての PostScript コードと EPS コメントが追加されます。

```csharp
public void Save(Stream epsStream)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| epsStream | Stream | 出力 EPS ファイルのストリーム。 |

### 関連項目

* class [PsDocument](../)
* 名前空間 [Aspose.Page.EPS](../../psdocument/)
* 組み立て [Aspose.Page](../../../)

---

## Save() {#save}

保存数[`PsDocument`](../) EPSファイルとして。このメソッドは、PsDocument がゼロから作成された場合にのみ使用されます。

```csharp
public void Save()
```

### 関連項目

* class [PsDocument](../)
* 名前空間 [Aspose.Page.EPS](../../psdocument/)
* 組み立て [Aspose.Page](../../../)


