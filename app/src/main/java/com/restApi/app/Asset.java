package com.restApi.app;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="assets")
@NoArgsConstructor
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;
    @NotNull
    @Getter
    @Setter
    private String assetName;
    @NotNull
    @Getter
    @Setter
    private Integer quantity;

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", assetName='" + assetName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
