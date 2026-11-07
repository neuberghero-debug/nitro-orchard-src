# Nitro Orchard — 1.21.11 (decompiled)

Decompiled Java sources of the **Nitro Orchard** Fabric mod (mod id `ilovcats`)
for Minecraft 1.21.11, produced with [Vineflower](https://github.com/Vineflower/vineflower).

## What's here

- `src/main/java` — 592 decompiled classes (`dev.hawk22e.core`, mixin set,
  assets tree)
- `src/main/resources` — `fabric.mod.json`, mixin configs, fonts, shaders, sounds

## Features (from the decompiled class tree)

- Streamer mode (hides names/sensitive info in HUD)
- Aim optimizer, KeepSprint, firework move fixes
- Silent selected-stack switching, visual switch animations
- Custom font/atlas pipeline (`assets/cats/fonts`) and shader presets
- Mouse/keyboard input hooks with per-action tuning

## Layout notes

The package tree is obfuscated in the original jar (`aaaaaea`, `aaaaady`, …).
Names were left untouched so line numbers and stack traces still match the
release. `core/client/mixin` holds the actual mixin set.

## Requirements

- JDK 21+, Fabric Loader ≥ 0.16, Fabric API, Minecraft 1.21.11

## Building

No working wrapper or resolvable dependency set is included — the repo mirrors
the released jar. Use the release jar for playing.

## Credits

All rights belong to the original author(s). Published for reference/audit.
