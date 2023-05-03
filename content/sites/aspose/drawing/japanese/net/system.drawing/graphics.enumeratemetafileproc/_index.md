---
title: Delegate Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing for .NET API リファレンス
description: のコールバック メソッドを提供しますEnumerateMetafile方法
type: docs
weight: 550
url: /ja/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

のコールバック メソッドを提供します。[`EnumerateMetafile`](../graphics/enumeratemetafile/)方法。

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| recordType | EmfPlusRecordType | のメンバー[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/)メタファイル レコードの種類を指定する列挙。 |
| flags | Int32 | レコードの属性を指定するフラグのセット。 |
| dataSize | Int32 | レコード データのバイト数。 |
| data | IntPtr | レコード データを含むバッファーへのポインター。 |
| callbackData | PlayRecordCallback | 引数は使用されません。 |

### 戻り値

レコードの列挙を続行する場合は true を返します。それ以外の場合は false。

### 関連項目

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


