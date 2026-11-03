# Nitro Orchard — 1.21.11 (decompiled)

Decompiled Java sources of the **Nitro Orchard** Fabric mod (mod id `ilovcats`)
for Minecraft 1.21.11, produced with Vineflower.

## What's here

- `src/main/java` — 592 decompiled classes (`dev.hawk22e.core`, mixin set, assets tree)
- `src/main/resources` — `fabric.mod.json`, mixin configs, fonts, shaders, sounds

## Features (from the decompiled class tree)

- Streamer mode (hides names/sensitive info in HUD)
- Aim optimizer, KeepSprint, firework move fixes
- Silent selected-stack switching, visual switch animations
- Custom fonts, shaders, sounds, cape cosmetics

## Requirements

- JDK 21+ (Minecraft 1.21.x runtime baseline — bytecode targets `--release 21`)
- Fabric Loader ≥ 0.16, Fabric API, Yarn `1.21.11+build.1`

## Notes on completeness

The jar ships with flow/string obfuscation, so a share of classes carries
synthesized names (`aaaa…`) — this is how the classes exist inside the jar, not
omitted content. Obfuscated control flow may decompile partially; that's inherent
to the decompiler, not a redaction.

Not buildable as-is; the Gradle files are a reconstruction skeleton only.

## Purpose

Reference and auditing. All rights belong to the original authors.
