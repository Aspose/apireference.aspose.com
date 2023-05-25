---
title: TYPE_FLIP property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 120
url: /aspose.cad/matrix/type_flip/
is_root: false
---

## TYPE_FLIP property


This flag bit indicates that the transform defined by this object
performs a mirror image flip about some axis which changes the
normally right handed coordinate system into a left handed
system in addition to the conversions indicated by other flag bits.
A right handed coordinate system is one where the positive X
axis rotates counterclockwise to overlay the positive Y axis
similar to the direction that the fingers on your right hand
curl when you stare end on at your thumb.
A left handed coordinate system is one where the positive X
axis rotates clockwise to overlay the positive Y axis similar
to the direction that the fingers on your left hand curl.
There is no mathematical way to determine the angle of the
original flipping or mirroring transformation since all angles
of flip are identical given an appropriate adjusting rotation.
NOTE: TypeFlip was added after GENERAL_TRANSFORM was in public
circulation and the flag bits could no longer be conveniently
renumbered without introducing binary incompatibility in outside
code.

### See Also
* module [`aspose.cad`](../../)
* class [`Matrix`](/cad/python-net/aspose.cad/matrix)
